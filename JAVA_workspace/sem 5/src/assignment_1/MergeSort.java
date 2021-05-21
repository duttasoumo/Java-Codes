package assignment_1;

import java.util.Scanner;

class MergeSort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort ms=new MergeSort();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter the elements of array one by one : ");
		for(int i=0;i<n;i++){
			System.out.printf("\na[%d]: ",i);
			a[i]=sc.nextInt();
		}

		ms.display(a,0,n-1);
		sc.close();
	}

	void mergeSort(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,high);
		}
	}
	void merge(int a[],int low,int high)
	{
		int c[]=new int[high-low+1];
		int mid=(low+high)/2;
		int i,j,k;
		for(i=low ,j=mid+1,k=0;i<=mid && j<=high;k++){
			if(a[i]<a[j])
				c[k]=a[i++];
			else 
				c[k]=a[j++];
		}
		while(i<=mid){
			c[k++]=a[i++];
		}
		while(j<=high){
			c[k++]=a[j++];
		}
		for(i=low,k=0;i<=high;i++,k++)
			a[i]=c[k];
	}
	void display(int a[],int s,int e)
	{
		System.out.println("****OUTPUT****");
		for(int i=s;i<=e;i++){
			System.out.printf("\na[%d] = %d",i,a[i]);
		}
	}

}
