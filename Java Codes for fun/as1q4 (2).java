//as1q4
import java.io.*;
class Sum
{
public int a[]=new int[20];
public int n;
	public Sum(int x[],int m)
	{
	int i;
	n=m;
		for(i=0;i<n;i++)
		a[i]=x[i];
	}
	public int sum()
	{
	int s,i;
	s=0;
		for(i=0;i<n;i++)
		s+=a[i];
	return s;
	}
	public float average()
	{
	int s;
	float avg;
	s=sum();
	avg=(float)s/n;
	return avg;
	}
	public int large()
	{
	int big,i;
	big=a[0];
		for(i=1;i<n;i++)
			if(a[i]>big)
			big=a[i];
	return big;
	}
	public double s_dev()
	{
	double sd,avg;
	int i;
	avg=average();
	sd=0;
		for(i=0;i<n;i++)
		sd=sd+(avg-a[i])*(avg-a[i]);
	sd=Math.sqrt(sd/(double)n);
	return sd;
	}
}
class assn4
{
	public static void main(String args[])throws IOException
	{
	int a[]=new int[20];
	int s,big,i,n;
	double avg,sd;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter number of elements=");
	n=Integer.parseInt(br.readLine());
	System.out.println("Enter "+n+" elements one by one--->");
		for(i=0;i<n;i++)
		{
		System.out.print("a["+i+"]=");
		a[i]=Integer.parseInt(br.readLine());
		}
	Sum S=new Sum(a,n);
	s=S.sum();
	avg=S.average();
	big=S.large();
	sd=S.s_dev();
	System.out.println("Sum=" +s+ "Average=" +avg+ "Largest value=" +big+ "S-dev=" +sd);
	}
}	