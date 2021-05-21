//convert character to bits and then bits to DNA sequence
import java.io.*;
class Bit_Conversion
{
	public void bit_conversion(int n,int b[])
	{
	int mask;
	int k, i;
	mask=128;
	i=0;
		while(mask>0)
		{
		k=n & mask;
			if(k==0)
			b[i++]=0;
			else
			b[i++]=1;
		mask=mask>>1;
		}
	}
}
class DNA
{
	public static void main(String args[])throws IOException
	{
	int n,ch,i;
	int b[]=new int[8];
	String file1,file2;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter Input File name=");
	file1=br.readLine();
	System.out.print("\nEnter Output File name=");
	file2=br.readLine();
	FileInputStream fp1=new FileInputStream(file1);
	FileOutputStream fp2=new FileOutputStream(file2);
	n=0;
	Bit_Conversion BC=new Bit_Conversion();
		while((ch=fp1.read())!=-1)
		{
		n++;
		BC.bit_conversion(ch,b);
//To convert 8 bits to DNA sequence
			for(i=0;i<8;i=i+2)
				if(b[i]==0 &&  b[i+1]==0)
				fp2.write(65);
				else if(b[i]==0 && b[i+1]==1)
				fp2.write(84);
				else if(b[i]==1 && b[i+1]==0)
				fp2.write(67);
				else if(b[i]==1 && b[i+1]==1)
				fp2.write(71);
		}
	fp1.close();
	fp2.close();
	int n1;
	n1=4*n;
	System.out.println("\nNumber of Bytes in "+file1+"="+n+" Bytes");
	System.out.println("\nNumber of Bytes in "+file2+"="+n1+" Bytes");
	}
}
	