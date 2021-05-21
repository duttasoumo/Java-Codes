import java.util.*;
class Spcl_Talents extends Student
{
    String st;
    String achievements;

    Spcl_Talents(int r,String n,String s,String a)
    {   super(r,n);
        st=s;
        achievements=a;
    }

    void disp()
    {
        super.disp();
        System.out.println("SPECIAL TALENTS : "+st);
        System.out.println("ACHIEVEMENTS IN FIELDS OTHER THAN EDUCATION :"+achievements);
    }

    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NAME OF THE STUDENT : ");
        String n=sc.nextLine();
        System.out.println("ENTER ROLL NO.");
        int r=sc.nextInt();
        System.out.println("ENTER ANY SPECIAL TALENTS OF THE STUDENT OR CO-CURRICULAR ACTIVITIES PERFORMED,IF ANY : ");
        String t=sc.nextLine();
        System.out.println("ENTER ANY ACHIEVEMENTS OF THE STUDENT IN FIELDS OTHER THAN EDUCATION : ");
        String a=sc.nextLine();

        Spcl_Talents S = new Spcl_Talents(r,n,t,a);
        S.disp();
    }
}
