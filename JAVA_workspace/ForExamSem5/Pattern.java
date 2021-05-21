import java.util.Scanner;

class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s=sc.nextLine();
		System.out.print("\nEnter P1 : ");
		String p1=sc.nextLine();
		System.out.print("\nEnter P2 : ");
		String p2=sc.nextLine();
		
		String ar[]=s.split(p1);
		for(i=0;i<ar.length-1;i++)	System.out.print(ar[i]+p2);
		System.out.println(ar[i]);
		
		sc.close();
	}

}
