package itemSet;
public class ItemSet_2 {

	String st;

	public ItemSet_2(String st) {
		this.st = st;
	}
	
	public String[] combi() {
		String item[]=st.split(",");
		int n=item.length;int c=0;
		int sz=(int)nCr(n,2);
		String ar[]=new String[sz];
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++,c++){
				ar[c]=item[i]+","+item[j];
			}
		
		return ar;
		
	}
	
	int nCr(int n,int r){
		return factorial(n)/(factorial(n-r)*factorial(r));
	}
	
	int factorial(int num) {
		int fct=1;
	    for(int i=2;i<=num;i++) fct*=i;
		return fct;
	}
	
}
