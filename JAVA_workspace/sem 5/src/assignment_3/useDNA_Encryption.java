package assignment_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class useDNA_Encryption
{
	public static void main(String args[])
	{
		DNA_Encryption ob=new DNA_Encryption();
		try {
			ob.encrypt();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.err.println("Error occured during proccessing");
			e.printStackTrace();
		}
	}
} 

class DNA_Encryption {

	final String A="00",T="11",G="10",C="01";
	
	void encrypt() throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a valid file name with full path : ");
		String file_path=sc.nextLine();
		File file1=new File(file_path), file2;
		if(!file1.exists() || !file1.canRead()){
			System.err.print("Error in file");
			System.exit(1);
		}
		System.out.print("Will the Output be in the same Directory ?(y/n) : ");
		if(sc.nextLine().charAt(0)=='y'){
			//if((new File(file1.getAbsolutePath())).isDirectory()){
				file2=new File(file1.getParent()+"\\DNAEncryptedFile.txt");
				file2.createNewFile();
				sc.close();
				System.out.println("Number of bytes Encrypted : "+encryption(file1,file2));
				return;
		//	}  else System.err.println("Parent Directory Unreadable !");
		}
		System.out.print("\nEnter full path of destination Directory : ");
		file_path=sc.nextLine();
		if(!(new File(file_path).isDirectory())){
			System.err.println("Directory Unreachable");
			System.exit(2);
		}
		file2=new File(file_path+"\\DNAEncryptedFile.txt");
		file2.createNewFile();
		System.out.println("Number of bytes Encrypted : "+encryption(file1,file2));
		sc.close();
		return;
	}
	private int encryption(File file1,File file2) throws IOException{
		
		FileInputStream fin=new FileInputStream(file1);
		FileOutputStream fout=new FileOutputStream(file2);
		byte b[]=new byte[fin.available()];
		int n=fin.read(b),i;
		for(i=0;i<n;i++){
			convert(b[i],fout);
		}
		fin.close();
		fout.close();
		return i;
	}
	private void convert(byte b, FileOutputStream fout) throws IOException {
		byte[] arr=new byte[8];
		for(int c=7;c>=0;c--,b/=2)
			arr[c]=(byte)(b%2);
		for(int c=0;c<8;c++){
			String bp=arr[c]+""+arr[++c];
			if(bp.equals(A))		fout.write("A".getBytes());
			else if(bp.equals(T)) 	fout.write("T".getBytes());
			else if(bp.equals(G)) 	fout.write("G".getBytes());
			else if(bp.equals(C)) 	fout.write("C".getBytes());
		}
		}
	}

