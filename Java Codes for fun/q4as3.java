//A program to write byte number & byte in some output file.
import java.io.*;
 class q4as3
 {
    public static void main(String args[]) throws IOException 
{
        String file1, file2;
        int ch;
        int n,ch1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nenter input file name:");
	file1=br.readLine();
	System.out.print("\nenter output file name:");
	file2=br.readLine();
            FileInputStream fp1 = new FileInputStream(file1);
	 FileOutputStream fp2 = new FileOutputStream(file2);
            n = 0;
            while ((ch = fp1.read()) != -1)
	 {
              	 	 n++;
		fp2.write(n);
		fp2.write(ch);
	}
	fp1.close();
	fp2.close();
	FileInputStream fp3=new FileInputStream(file2);
	n=0;
	while((ch=fp3.read())!=-1)
	{
		n++;
		System.out.print(n+" ");
		ch1=fp3.read();
		if(ch>=9 && ch<=13)
			System.out.print(" ");
		else
			System.out.print((char)ch1+" ");
		System.out.println(ch1);
		if((n%20)==0)
		{
			System.out.println("Enter any key:");
			br.readLine();
		}
	}
	}
}
           