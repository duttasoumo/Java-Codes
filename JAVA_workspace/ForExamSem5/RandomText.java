
import java.io.IOException;
import java.io.RandomAccessFile;

class RandomText {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile rad=new RandomAccessFile("abc.txt","rwd");
		String st=rad.readLine();
		System.out.println(st);
		rad.writeInt(65);
		rad.close();
	}

}
