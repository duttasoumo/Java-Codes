package abc.def.pkg1;

public class Test {
	
	
	static void sort(int a[]){
		for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length-i-1;j++)
				if(a[j]>a[j+1]){
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,4,3,2,1};
		sort(a);
		System.out.println(a[0]);
	}

}
