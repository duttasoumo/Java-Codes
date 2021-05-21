import java.util.Scanner;

class GreatestCommonSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter s1 : ");
		String s1=sc.nextLine();
		System.out.print("Enter s2 : ");
		String s2=sc.nextLine(); sc.close();
		String z="";int max=0;
		for(int i=0;i<s1.length();i++){
			for(int j=s1.length();j>=i;j--){
				if(s2.indexOf(s1.substring(i, j))!=-1){
					if(max<s1.substring(i, j).length()){
						max=s1.substring(i, j).length();
						z=s1.substring(i, j);
						}	
					}
				}
			}
		System.out.println("Sub String : "+z);
		}
}


