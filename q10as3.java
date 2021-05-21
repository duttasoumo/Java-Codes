import java.io.*;
class q10as3
{
	public static void main(String args[])throws IOException
	{
	String file1;
	String name,email,phone;
	int nam[]=new int[20];
	int em[]=new int[45];
	int ph[]=new int[12];
	int n1,n2,n3;//n1=length of name,n2=lngth of e-mail,n3=length of phone
	int i,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the Output File=");
	file1=br.readLine();
	FileOutputStream fp2=new FileOutputStream(file1);
		do
		{
		System.out.print("\nEnter name(1-20)=");
		name=br.readLine();
		System.out.print("Enter e-mail(1-45)=");
		email=br.readLine();
		System.out.print("Enter Phone number(1-12)=");
		phone=br.readLine();
		n1=name.length();
		n2=email.length();
		n3=phone.length();
		//to convert characters to integers
			for(i=0;i<n1;i++)
			nam[i]=(int)name.charAt(i);
			for(i=0;i<n2;i++)
			em[i]=(int)email.charAt(i);
			for(i=0;i<n3;i++)
			ph[i]=(int)phone.charAt(i);
		//to write on output file
		for(i=0;i<20;i++)
		fp2.write(nam[i]);
		for(i=0;i<45;i++)
		fp2.write(em[i]);
		for(i=0;i<12;i++)
		fp2.write(ph[i]);
	System.out.print("\nType '1' to add a new record--->");
	n=Integer.parseInt(br.readLine());
	}while(n==1);
}
}