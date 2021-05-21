package assignment_3;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class CommentRemover {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter full path of source file : ");
		String file=sc.nextLine();
		sc.close();
		File f1=new File(file);
		if(!f1.exists()){
			System.err.print("Error 404 : File not Found");
			System.exit(1);}
		change(f1);
		
	}

	private static void change(File f1) throws IOException {
		// TODO Auto-generated method stub
			RandomAccessFile file =new RandomAccessFile(f1,"rws");
			for(int i=0,flag=0;i<file.length();i++){
				char ch = file.readChar();
				switch(flag){
				case 0:if(ch=='/'){
						flag=1;
						continue;
				}
						break;
						
				}
						
				
			
		
			}
	}

}
