package assignment_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

class spliter {
	void split() throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a valid file name with full path : ");
		String file_path=sc.nextLine();
		System.out.print("Enter number of split files : ");
		int n=sc.nextInt(),i;
		File file1=new File(file_path),file2[]=new File[n];
		FileInputStream fin=new FileInputStream(file1);
		StringTokenizer st=new StringTokenizer(file1.getName(), ".");
		String name=st.nextToken(),ext=st.nextToken();
		int size=(int)Math.round(fin.available()*1.0/n);
		byte b[]=new byte[size];
		for(i=0;i<n;i++){
			file2[i]=new File(file1.getParentFile()+"\\"+name+(i+1)+"."+ext);
			file2[i].createNewFile();
			FileOutputStream fout=new FileOutputStream(file2[i]);
			fin.read(b,0,size);
			fout.write(b);
			fout.close();
			if(i==n-2) b=new byte[size];
		}
		System.out.println("Size of each split : "+size);
		sc.close();
		fin.close();
	}
	public static void main(String agrs[]){
		spliter sp=new spliter();
		try {
			sp.split();
		} catch (IOException e) {
			System.err.print("Error in INPUT FILE");
			System.exit(1);
			//e.printStackTrace();
		}
		System.out.println("Splitting successfully Completed");
	}
}
