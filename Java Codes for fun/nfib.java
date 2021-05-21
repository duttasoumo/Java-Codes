//q10iias1
//fibonacci
import java.io.*;
class Fib
{
	public double fib(int n)
	{
		if(n<=2)
		return 1;
		else
		return fib(n-1)+fib(n-2);
	}
}
class nfib
{
	public static void main(String args[])throws IOException
	{
	double f;
	int i,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter n=");
	n=Integer.parseInt(br.readLine());
	Fib F=new Fib();
		for(i=1;i<=n;i++)
		{
		f=F.fib(i);
		System.out.println("fib("+i+")="+f);
		}
	}
}