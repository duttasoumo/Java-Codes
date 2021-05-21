package assignment_1;

import java.util.Scanner;
class HeapSort {
	
	void adjust(int a[],int i,int n)
	{
		int item=a[i];
		while((i*=2)<=n)
		{
			if(i<n && a[i]>a[i+1])	i++;
			if(item<=a[i]) break;
			a[i/2]=a[i];
		}
		a[i/2]=item;
	}
	
	int delete(int a[],int n)
	{
		int item=-9999;
		if(n==0) return item;
		item=a[1];
		a[1]=a[n];
		adjust(a,1,n);
		return item;
	}
	
	int insert(int a[],int n,int item)
	{
		if(n==a.length-1) return 1;
		//n++;
		a[n]=item;
		for(int i=n/2;i>=1;i--) adjust(a,i,n);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort ob=new HeapSort();
		int i=0,a[]=new int[20];
		
		Scanner sc=new Scanner(System.in);
		char ch;
		do{
			System.out.print("\nEnter element at "+(++i)+" position : ");
			if(ob.insert(a, i, sc.nextInt())==1) 
				System.out.println("ARRAY FULL");
			System.out.print("\nDo you want to continue (y/n) : ");
			ch=sc.next().charAt(0);
		}while(ch=='y');
		
		System.out.println("\nInserted ARRAY");
		for(int j=1;j<=i;j++) System.out.print(a[j]+"\t");
		
		System.out.println("\nSORTTED ARRAY");
		for(;i>=1;i--) System.out.print(ob.delete(a, i)+"\t");
		sc.close();
	}

}

