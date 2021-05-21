//To extract all words from any file
import java.io.*;
class extract
{
	
	public static void main(String args[])throws IOException
	{
		String file1,file2;
		int ch,nw,flag;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.print("\nenter input file name:");
		file1=br.readLine();
		System.out.print("\nenter output file name:");
		file2=br.readLine();
		 FileInputStream fp1 = new FileInputStream(file1);
		 FileOutputStream fp2 = new FileOutputStream(file2);
		nw=0;
		flag=1;
		while ((ch = fp1.read()) != -1)
		{
			if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
			{
				System.out.print((char)ch);
				fp2.write(ch);
				if(flag==1)
				{
					nw++;
					flag=0;
					if((nw%20)==0)
				{
					System.out.print("\nPress any key:");
					br.readLine();
					System.out.println();
				}
				}
			}
			else if(flag==0)
			{
				System.out.println();
				fp2.write(13);
				fp2.write(10);
				flag=1;
				}
			}
			fp1.close();
			fp2.close();
			System.out.println("Total number of words="+nw);
		
	}
		
}
