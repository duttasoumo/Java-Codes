package itemSet;

public class ItemSet_3 extends ItemSet_2 {
	public ItemSet_3(String st) {
		super(st);
		// TODO Auto-generated constructor stub
	}
	
	public String[] combi() {
		String item[]=st.split(",");
		int n=item.length;int c=0;
		int sz=(int)nCr(n,3);
		String ar[]=new String[sz];
		for(int i=0;i<n-2;i++)
			for(int j=i+1;j<n-1;j++)
				for(int k=j+1;k<n;k++,c++){
					ar[c]=item[i]+","+item[j]+","+item[k];
				}
		
		return ar;
	}
}
