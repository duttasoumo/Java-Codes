import java.io.*;
class modify
{
	public void add(String file1)throws IOException
	{
	String name,email,phone,str;
	long n;
	str="";
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	RandomAccessFile fout=new RandomAccessFile(file1,"rw");
	System.out.println("Enter name:");
	name=br1.readLine();
	System.out.println("Enter email:");
	email=br1.readLine();
	System.out.println("Enter phone:");
	phone=br1.readLine();
	str=str+name+","+email+","+phone;
	n=fout.length();
	if(n!=0){
	fout.seek(n);
	fout.write(13);
	fout.write(10);
	}
	fout.writeBytes(str);
	fout.close();
	}
	public void modi(String file1)throws IOException{
	String name,email,phone,str;
	long n;
	str="";
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	RandomAccessFile fout=new RandomAccessFile(file1,"rw");
	n=search(file1);
	if(n==-1){
		System.out.println("RECORD not present");
		return;
	}
	System.out.println("Enter name:");
	name=br1.readLine();
	System.out.println("Enter email:");
	email=br1.readLine();
	System.out.println("Enter phone:");
	phone=br1.readLine();
	str=str+name+","+email+","+phone;
	fout.seek(n);
	fout.write(str.getBytes(),(int)n,str.length());
	fout.close();
	}
	public long search(String file1)throws IOException{
	String str,name;
	long n;
	str="";
	BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	RandomAccessFile fout=new RandomAccessFile(file1,"rw");
	System.out.println("Enter name:");
	name=br1.readLine();
	fout.seek(0);
	while(fout.getFilePointer()<fout.length()){
		n=fout.getFilePointer();
		str=fout.readLine();
		
		int x=str.indexOf(',');
		System.out.println(str+"<--->"+x);
		if(x!=-1 && str.substring(0,x).equalsIgnoreCase(name)){
			System.out.println(str);
			fout.close();
			return n;
		}
	}
	fout.close();
	return -1;
	}
}

class q10as3
{
	public static void main(String args[]) throws IOException
	{
	String file1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter file name:");
	file1=br.readLine();
	modify m=new modify();
	//m.add(file1);
	m.modi(file1);
	}
}