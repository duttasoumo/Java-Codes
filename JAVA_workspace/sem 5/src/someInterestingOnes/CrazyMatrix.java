package someInterestingOnes;

import java.util.Scanner;

class CrazyMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of a nxn Matrix : ");
		int n=sc.nextInt(),ar[][]=new int[n][n];
		int c=0,i=0,j,x=1;
		while(c<=2*n-1){
			for(i=0;i<=c;i++){
				if(i<n && c-i<n)
					ar[c-i][i]=x++;
			}
			c++;
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++) System.out.print(ar[i][j]+"\t");
			System.out.println();
		}
		sc.close();
	}

}
