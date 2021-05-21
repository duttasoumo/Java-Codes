package assignment_1;

import java.util.Scanner;

class QuickSort {
	
	void sort(int a[],int high,int low)
	{
		if(low<high){
		int pivot_key=partition(a,high,low);
		sort(a,pivot_key-1,low);
		sort(a,high,pivot_key+1);
		}
	}
	
	int partition(int a[],int high,int low)
	{
		int pivot_loc,pivot_key;
		swap(a,(low+high)/2,low);
		 pivot_key=a[low];
		 pivot_loc=low;
		 for(int i=low+1;i<=high;i++)
		 {
			 if(a[i]<pivot_key)
				 swap(a,++pivot_loc,i);
		 }
		 swap(a,low,pivot_loc);
		 return pivot_loc;
	}
	
	void swap(int a[],int i,int j)
	{
		int temp=a[j];
		a[j]=a[i];
		a[i]=temp;
	}
	
	void display(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"] = "+a[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		System.out.println("***INPUTS***");
		Scanner sc=new Scanner(System.in);
		QuickSort qs=new QuickSort();
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter element at "+(i+1)+" position : ");
			a[i]=sc.nextInt();
		}
		System.out.println("Before Sorting");
		qs.display(a);
		qs.sort(a,a.length-1,0);
		System.out.println("After Sorting");
		qs.display(a);
		sc.close();
	}

}
