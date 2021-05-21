import java.util.*;
class EvilNumbers
{
    String d2b(int n)
    {
        if(n>0)
        {
            int d=n%2;
            n/=2;
            return d+d2b(n);
        }
        return "";
    }
    

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int d,c=0,n;
        System.out.print("INPUT\t\t\t:");
        d=sc.nextInt();
        if(d==0) System.exit(1);
        EvilNumbers ob=new EvilNumbers();
        long cpy,b;cpy=b=Long.parseLong(ob.d2b(d));
        System.out.print("BINARY EQUIVALENT\t:"+b);
        while(cpy>0)
        {
            if(cpy%10==1)
                c++;
            cpy/=10;
        }
        System.out.print("\nNO. OF 1’s\t\t:"+c);
        
        if(c==0)
            System.out.println("\nOUTPUT\t\t\t:NOT AN EVIL NUMBER");
            else
            
        if(ob.isEven(c)==true)
            System.out.println("\nOUTPUT\t\t\t:EVIL NUMBER");
        else
            System.out.println("\nOUTPUT\t\t\t:NOT AN EVIL NUMBER");
    }

    boolean isEven(int n)
    {
        if(n%2==0)
            return true;
        return false;
    }
}
