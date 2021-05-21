package hash;

public class Hashing {

	private int x,y,z;

	public Hashing() {
		x=y=z=0;
	}

	public int getHash() {
		int n= (z*100)+(y*10)+(x);
		return n%7;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
}
