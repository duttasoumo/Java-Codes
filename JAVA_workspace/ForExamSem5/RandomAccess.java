import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

class RandomAccess {
	
	void cmntRvm(File fp) throws IOException{
		RandomAccessFile rad=new RandomAccessFile(fp, "rwd");
		long pos=0;
		long len=rad.length();
		char ch='\0';
		do{
			
		pos++;
		ch=(char)rad.read();
		System.out.println(ch+"("+pos+")");
		}while(len-pos!=0);
		
		rad.close();
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccess obj=new RandomAccess();
		obj.cmntRvm(new File("abc.txt"));
	}

}
