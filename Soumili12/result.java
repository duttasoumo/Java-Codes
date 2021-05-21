import java.util.*;
class result extends Marks
{   double avg;

    result(int r,String n,int a,int b)
    {
        super(r,n,a,b);
        avg=0.0;
    }

    void disp()
    {
        super.disp();
        avg=(m1+m2)/2.0;
        System.out.println("AVERAGE : "+avg);
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME OF A STUDENT,ROLL NO. AND MARKS IN TWO SUBJECTS : ");
        String n=sc.nextLine();
        int r=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();

        result R=new result(r,n,a,b);
        R.disp();
    }
}
