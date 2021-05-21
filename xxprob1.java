//calculate and print s=a+b+c, avg=s/3
import java.io.*;
class xxprob1
{
	public static void main(String args[])throws IOException
	{
	int a,b,c;
	int s,avg;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter a=");
	a=Integer.parseInt(br.readLine());
	System.out.print("\nEnter b=");
	b=Integer.parseInt(br.readLine());
	System.out.print("\nEnter c=");
	c=Integer.parseInt(br.readLine());
	s=a+b+c;
	avg=s/3;
	System.out.println("sum="+s+"average="+avg);
	}
}