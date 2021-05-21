import java.io.*;
class q7iias4
{
public static void main(String args[]) throws IOException
{
String s1,s2,z;
int i,j,max;
max=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter s1:");
s1=br.readLine();
System.out.println("Enter s2:");
s2=br.readLine();
z="";
for(i=0;i<s1.length();i++)
{
for(j=s1.length();j>=i;j--)
{
if(s2.indexOf(s1.substring(i,j))!=-1)
{
if(max<s1.substring(i,j).length())
{
max=s1.substring(i,j).length();
z=s1.substring(i,j);
}
}
}
}
System.out.println("sub string="+z);
}
}
