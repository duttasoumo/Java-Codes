//wap to convert all small letters to capital letters
import java.io.*;
class small_to_C
{
	public static void main(String args[])throws IOException
	{
	String file1;
	int n,ch,nc;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("\nEnter File Name=");
	file1=br.readLine();
	RandomAccessFile fp1=new RandomAccessFile(file1,"rw");
	n=nc=0;
		while((ch=fp1.read())!=-1)
		{
		n++;
			if(ch>=97 && ch<=122)
			{
			ch=ch-32;
			fp1.seek(n-1);
			fp1.write(ch);
			nc++;
			}
		}
	fp1.close();
	System.out.println("\nNumber of bytes in "+file1+"="+n+"Bytes");
	System.out.println("Number of bytes modified="+nc);
	}
}