package test;

public class Test {
	public static void main(String agrs[]) {
		// TODO Auto-generated method stub

		int n=3;
		int a[]=new int[10];
		a[3]=2;
		a[++n]=n++;
		int b=3,c=2,d=-1;
		b=c=++d;
		System.out.println(a[4]);
	}

}
