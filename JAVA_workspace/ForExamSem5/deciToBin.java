
class deciToBin {
	
	void dTb(int x){
		int copy=x;
		int ar[]=new int[8];
		for(int i=0;copy>0;i++,copy/=2){
			ar[i]=copy%2;
		}
		for(int i=7;i>=0;i--)System.out.print(ar[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new deciToBin().dTb(25);
	}

}
