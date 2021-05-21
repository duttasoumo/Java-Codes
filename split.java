//split one file into many output files
import java.io.*;
class split
{
	public static void main(String args[])throws IOException
	{
		int nargs,ch,i;
		long j,k;
		long n1,n2,n;
		nargs=args.length;
	RandomAccessFile fp1=new RandomAccessFile(args[0],"r");
		n=fp1.length();//n=last byte position
		n1=n/(nargs-1);//n1=size of all files except the last one
		n2=n-n1*(nargs-2);	//size of last output file
	//to transfer data from input file to all output files
			for(i=1;i<nargs;i++)
			{
		FileOutputStream fp2=new FileOutputStream(args[i]);
				if(i!=(nargs-1))
				k=n1;
				else
				k=n2;
				for(j=1;j<=k;j++)
				{
				ch=fp1.read();
				fp2.write(ch);
				}
			fp2.close();
			}
		fp1.close();
	System.out.println("Size of"+args[0]+"="+n+"Bytes");
		for(i=1;i<nargs;i++)
		{
			if(i!=(nargs-1))
			k=n1;
			else
			k=n2;
	System.out.println("Size of"+args[i]+"="+k+"Bytes");
		}
	}
}
		