package someInterestingOnes;

import java.util.Scanner;

class SubSet {
	
	void subset_generate(String ch[]) {
		int len=ch.length;
		System.out.println("{}");
		for(int size=1;size<=len;size++)
		{	
			int a[]=new int[size];
			for(int i=0;i<size;i++)	a[i]=i;
			
			for(int i=size-1;;)
			{
				System.out.print("\n{");
				System.out.print(ch[a[0]]);
				for(int j=1;j<size;j++) System.out.print(" , "+ch[a[j]]);
				System.out.print("}");
				a[i]++;
				//if(a[i]==size-i-1) break;
				if(a[i]==len)
				{
					if(incr(a,len)==1) 	break;
					else				continue;
				}
			}
		}
	}
	int incr(int a[],int len){
		int flag=1;
		for(int i=a.length-2;i>=0;i--){
			if(a[i]++==len-(a.length-i)){
				continue;
			}
			flag=0;
			for(i++;i<a.length;i++){
				a[i]=a[i-1]+1;
			}
			if(flag==0) break;
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		SubSet ob=new SubSet();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements of a set separated by comma(,) enclosed within { }");
		String st=sc.nextLine().trim();
		sc.close();
		ob.subset_generate((st.substring(1,st.length()-1)).split(","));
	}

}
