import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RandomAccessFile extends java.io.RandomAccessFile {

	public RandomAccessFile(String name, String mode) throws FileNotFoundException {
		super(name, mode);
		// TODO Auto-generated constructor stub
	}

	public RandomAccessFile(File file, String mode) throws FileNotFoundException {
		super(file, mode);
		// TODO Auto-generated constructor stub
	}

	public void write(int inipos, int len) throws IOException {
		// TODO Auto-generated method stub
	this.seek(inipos);
		for(int i=0;i<len;i++) this.write(" ".getBytes());
	}

}
