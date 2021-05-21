import java.io.*;
class Cmp
{
public int strcmp(String p,String s)
{
int np,ns,i,j,flag,k;
char ch1,ch2;
String s1,s2;
boolean b;
np=p.length();
ns=s.length();
k=-1;
for(i=0;i<ns;i++)
{
flag=1;
for(j=0;j<np;j++)
{
ch1=s.charAt(i+j);
ch2=p.charAt(j);
s1=String.valueOf(ch1);
s2=String.valueOf(ch2);
b=s1.equalsIgnoreCase(s2);
if(!b)
{
flag=0;
break;
}
}
if(flag==1)
{
k=i;
break;
}
}
return k;
}
}
class q9as4
{
public static void main(String args[]) throws IOException
{
String p,s,r,s1,s2;
int n,k,np,ns,nr,i,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter string:");
s=br.readLine();
System.out.println("enter pattern:");
p=br.readLine();
System.out.println("enter pattern to replace");
r=br.readLine();
ns=s.length();
nr=r.length();
np=p.length();
Cmp c=new Cmp();
k=c.strcmp(p,s);
s1="";
s1=s;
while(k!=-1)
{
s2="";
for(i=0;i<k;i++)
s2=s2+s1.charAt(i);
for(i=0;i<nr;i++)
s2=s2+r.charAt(i);
for(i=k+np;i<ns;i++)
s2=s2+s1.charAt(i);
s1=s2;
k=c.strcmp(p,s1);
}
System.out.println("Modified string="+s1);
}
}

