package assignment_1;

import java.util.Scanner;

class TowerOfHanoi {

	void recurs(int frompeg,int topeg,int nd){
	if(nd==1){ 
		System.out.println("\t "+nd+"   :\t "+frompeg+"  -->\t"+topeg);
		return;
	}
	int helppeg=6-(frompeg+topeg);
	recurs(frompeg,helppeg,nd-1);
	System.out.println("\t "+nd+"   :\t "+frompeg+"  -->\t"+topeg);
	recurs(helppeg,topeg,nd-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of disk : ");
		int x=sc.nextInt();
		System.out.println("MOVES\tDisk\tFrom\tTo");
		TowerOfHanoi ob=new TowerOfHanoi();
		ob.recurs(1, 3, x);
		sc.close();		
	}

}
