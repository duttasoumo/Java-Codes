package assignment_3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class FileReader {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\JAVA_workspace\\sem 5\\src\\abc.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		System.out.println(file.getAbsolutePath());
		FileOutputStream fos = new FileOutputStream(file,true);
		fos.write("Writing to file\n".getBytes());
		fos.write("fhdsbfb\n".getBytes());
		fos.write(200);
		fos.close();
	}
}
