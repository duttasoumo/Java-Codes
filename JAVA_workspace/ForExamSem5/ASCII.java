import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class ASCII {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.print("Enter path : ");
		Scanner sc=new Scanner(System.in);
		RandomAccessFile rad=new RandomAccessFile(sc.nextLine(),"rw");
		System.out.print("Enter path of destination : ");
		FileWriter fout=new FileWriter(sc.nextLine());
		sc.close();
		while(rad.getFilePointer()<rad.length()){
			fout.write(rad.read()+"("+rad.getFilePointer()+") ");
		}
		rad.close();
		fout.close();
	}

}
