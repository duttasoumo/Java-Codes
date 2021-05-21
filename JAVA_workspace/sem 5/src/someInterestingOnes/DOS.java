package someInterestingOnes;

import java.io.IOException;

class DOS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new ProcessBuilder("copy D:\\MyErrorFile.txt D:\\RandomFolder").start();
	}

}
