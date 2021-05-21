import java.io.*;
class q1as2
{
public static void main(String args[]) throws IOException
{
int a[]=new int[10];
int b[]=new int[10];
int n,i,j;
j=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of elements");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the elements");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
if(a[i]>0)
{
b[j++]=a[i];
}
}
for(i=0;i<n;i++)
{
if(a[i]==0)
{
b[j++]=a[i];
}
}
for(i=0;i<n;i++)
{
if(a[i]<0)
{
b[j++]=a[i];
}
}
System.out.println("Modified array:");
for(i=0;i<n;i++)
System.out.println(b[i]);
}
}
