package assignment_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class Copy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Full path of a file :");
		String string=sc.nextLine();
		File srcFile=new File(string);
		if(!srcFile.exists() || srcFile.isDirectory()){					// srcFile.createNewFile(); 
		System.err.print("Error 404 : File Not Found");
		System.exit(1);
		}
		System.out.print("Enter Full path of a Destination directory :");
		String string2=sc.nextLine();
		File desFolder=new File(string2);
		if(!desFolder.exists() || !desFolder.isDirectory()){
			System.err.println("Error 404 : Directory NOT Found");
			System.exit(2);
		}
		File desFile=new File(desFolder.toString()+"\\"+name(desFolder,srcFile.getName()));
		desFile.createNewFile();
		if(!desFile.canWrite())
		{
			System.err.print("Directory NOT accesible");
			System.exit(3);
		}
		FileOutputStream fout=new FileOutputStream(desFile);
		FileInputStream fin=new FileInputStream(srcFile);
		/*for(int x=fin.read();x!=-1;x=fin.read())
			fout.write(x);*/
		byte[] b = new byte[fin.available()];	// best coping method ever !!
		int noOfBytesCoped = fin.read(b);
		fout.write(b);
		System.err.println("Successfully Copied : " + noOfBytesCoped);
		sc.close();
		fin.close();
		fout.close();
	}
	
	static String name(File dest,String name){
		String list[]=dest.list();
		for(int c=0,i=0;i!=list.length;c++){
		for(i=0;i<list.length;i++){
			if(list[i].equals(name)){
				if(c==0){
					name=name.substring(0,name.lastIndexOf("."))+"-copy"+name.substring(name.lastIndexOf("."));
					break;
				}
				else{
					name=name.substring(0,name.lastIndexOf("copy"))+"copy("+c+")"+name.substring(name.lastIndexOf("."));
					break;
				  }
				}
			}
		}
		return name;
		
	}

}
