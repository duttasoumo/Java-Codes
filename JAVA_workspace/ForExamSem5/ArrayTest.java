
class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[],c[]={1,2,3,4,5};
		a=c;
		System.out.println(c+"<--->"+a);
		System.out.println(c[0]+"<--->"+a[0]);
		c[0]=9;
		System.out.println(c[0]+"<--->"+a[0]);
		ArrayTest obj=new ArrayTest();
		Integer b=new Integer(5);
		System.out.println(obj);
		System.out.println(b);
	}

}
