//wap which will behave as the TYPE command of MSDOS
import java.io.*;
class display
{
	public static void main(String args[])throws IOException
	{
	int i,n,lc; //lc=line count,n=number of bytes
	int fs[]=new int[50];
	int ch,nargs;
	nargs=args.length;//To calculate no of arguments
	n=lc=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(i=0;i<nargs;i++)
		{
		FileInputStream fp1=new FileInputStream(args[i]);
		fs[i]=0;
		System.out.println("Content of"+args[i]+"===>");
			while((ch=fp1.read())!=-1)
			{
			System.out.print((char)ch);
			fs[i]=fs[i]+1;
				if(ch==10)
				{
				lc++;
					if((lc%20)==0)
					{
				System.out.print("Press enter key==>");
					br.readLine();
			System.out.println("Content of"+args[i]+"--->");
					}
				}
			}
		n=n+fs[i];			
		fp1.close();
		}
	System.out.println("Total number of Bytes shown="+n);
		for(i=0;i<nargs;i++)
	System.out.println("Size of"+args[i]+"="+fs[i]+" Bytes");
	}
}