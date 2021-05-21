//program to copy the content of one file to another file
//command line arguments
import java.io.*;
class ass3
{
	public static void main(String args[])throws IOException
	{
	String file1,file2;
	int ch,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	file1=args[0];
	file2=args[1];
	FileInputStream fp1=new FileInputStream(file1);
	FileOutputStream fp2=new FileOutputStream(file2);
	n=0;
		while((ch=fp1.read())!=-1)
		{
		fp2.write(ch);
		n++;
		}
	fp1.close();
	fp2.close();
	System.out.println("\nNumber of Byte copied to" +file2+" ="+n);
	}
}