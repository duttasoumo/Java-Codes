package someInterestingOnes;

import java.util.Scanner;

class ReverseBit {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int x=sc.nextInt();
		ReverseBit ob=new ReverseBit();
		sc.close();
		System.out.println(ob.reverse(x));
	}


	private int reverse(int x) {
		// TODO Auto-generated method stub
		long bin=bit(x);
		final long mask=1;
		for(int i=1;i<=32;i++){
			long a=bin&mask;
			bin=(a==mask)?bin>>1:bin>>>1;
		}
		return deci(bin,0);
	}


	private int deci(long bin,int n) {
		// TODO Auto-generated method stub
		if(bin==0) return 0;
		return (int) ((bin%10*(int)Math.pow(2, n++))+deci(bin/10,n));
	}


	private long bit(int x,long x) {
		// TODO Auto-generated method stub
		while(x/2)
	}

}
