//to remove comments from a program
import java.io.*;
public class random2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Enter the path of the file");
		File fp=new File(br.readLine());
		RandomAccessFile ra=new RandomAccessFile(fp,"rwd");
		long p1,p2;
		p1=ra.getFilePointer();
		int l;
		String s=ra.readLine();
		try{
		while(s.equals(null)==false)
		{  
			p2=ra.getFilePointer();
			/*System.out.println(" s = "+s);*/
			if(s.contains("//")==true)
			{   
				l=s.indexOf("//", 0);
					p1=p1+l;
					/*System.out.println("p1 = "+p1);*/
					ra.seek(p1);
					for(int i=(int)p1;i<(int)p2-1;i++)
						ra.write(' ');
					ra.writeBytes(System.getProperty("line.separator"));
					ra.seek(p2);
					
			}
			else if((s.contains("/*")==true) && (s.indexOf("*/", 0)!=-1))
			{
				long l1=s.indexOf("/*",0);
			    l=s.indexOf("*/",0);
			    ra.seek(p1+l1);
				for(int i=(int)(p1+l1);i<(int)(p1+l+2);i++)
					ra.write(' ');			
				ra.seek(p2);
				}
			s=ra.readLine();
			p1=p2;
			p2=ra.getFilePointer();
		}
		}
		catch(NullPointerException e)
		{}
		ra.close();
	}
}

