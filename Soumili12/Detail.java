class Detail
{
String name;
String address;
long telno;
double rent;

Detail(String n,String a,long t,double r)
{
name=n;
address=a;
telno=t;
rent=r;
}

void show()
{
System.out.println("NAME : "+name);
System.out.println("ADDRESS :"+address);
System.out.println("TELEPHONE NUMBER :"+telno);
}
}
