//reverse the content of any file
import java.io.*;
class reverse
{
	public static void main(String args[])throws IOException
	{
	String file1,file2;
	long i,n;
	int ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter Input File name=");
	file1=br.readLine();
	System.out.print("\nEnter Output File name=");
	file2=br.readLine();
RandomAccessFile fp1=new RandomAccessFile(file1,"r");
	FileOutputStream fp2=new FileOutputStream(file2);
	n=fp1.length(); //n=number of bytes in file1
		for(i=n-1;i>=0;i--)
		{
		fp1.seek(i);
		ch=fp1.read();
		fp2.write(ch);
		}
	fp1.close();
	fp2.close();
	System.out.println("Size of "+file1+"="+n+" Bytes");
	}
}