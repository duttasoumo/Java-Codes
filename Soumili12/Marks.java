class Marks extends Student
{
    int m1;
    int m2;

    Marks(int r,String n,int a,int b)
    {
        super(r,n);
        m1=a;m2=b;
    }

    void disp()
    {
        super.disp();
        System.out.println("MARKS OBTAINED : "+m1+" "+m2);
    }
}
