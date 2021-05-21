import java.util.*;
class pseudoArithmetic
{
    int n;int a[];int sum;boolean flag;int r;boolean ans;

    pseudoArithmetic()
    {
        n=0;
        a=new int[n];
        sum=0;
        flag=false;
        r=0;
        ans=false;
    }

    void accept(int num)
    {   n=num;
        a=new int[n];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBERS : ");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
    }    

    boolean check()
    {
        flag=true;
        int r=a[0]+a[n-1];
        for(int i=0;i<=n/2;i++)
            if((a[i]+a[n-i-1])!=r)
                flag=false;
        if(flag==true)
        { ans=true;
            sum=n/2*r;
            System.out.println("SUM OF THE ABOVE SEQUENCE : "+sum);
        }
        else
            ans=false;
        return ans;
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE OF SEQUENCE : ");
        int n=sc.nextInt();
        pseudoArithmetic ob=new pseudoArithmetic();
        ob.accept(n);
        if(ob.check()==true)
            System.out.println("THE ENTERED SEQUENCE OF NUMBERS ARE PSEUDO ARITHMETIC.");
        else
            System.out.println("THE ENTERED SEQUENCE OF NUMBERS ARE NOT PSEUDO ARITHMETIC.");
    }
}   