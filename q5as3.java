//A program which will copy the textual matter
import java.io.*;
class q5as3
{
	public static void main(String args[])throws IOException
	{
		String file1,file2;
		int ch,n,nc,lc=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=nc=0;
		  System.out.print("\nenter input file name:");
	file1=br.readLine();
	System.out.print("\nenter output file name:");
	file2=br.readLine();
            FileInputStream fp1 = new FileInputStream(file1);
	 FileOutputStream fp2 = new FileOutputStream(file2);
	while ((ch = fp1.read()) != -1)
	 {
              	 	 n++;
		if(ch>=32  && ch<=122)
		{
			System.out.print((char)ch);
			fp2.write(ch);
			nc++;
			if((nc%75)==0)
			{
				System.out.println();
				fp2.write(13);
				fp2.write(10);
				lc++;
				if((lc%20)==0)
				{
					System.out.println("\nPress any key:");
					br.readLine();
				}
					
				}																
			}
		}
		fp1.close();
		fp2.close();
		System.out.println("Size of"+file1+"="+n+"bytes");
		System.out.println("Size of"+file2+"="+nc+"bytes");
	}
}