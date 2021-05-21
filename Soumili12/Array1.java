import java.util.*;
class Array1
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ROWS AND COLUMNS : ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        if(m<=20&&n<=20)
        {int ar[][]=new int[m][n];
            for(int i=0;i<20;i++)
            {
                for(int j=0;j<20;j++)
                {
                    if(isPrime(i)==true);
                    ar[i][j]=i;
                }
            }

            System.out.println("THE ARRAY IS : ");
            for(int i=0;i<20;i++)
            {
                for(int j=0;j<20;j++)
                {  
                    System.out.println(ar[i][j]);
                }   
                System.out.println();
            }
        }

        else
            System.out.println("PLEASE EnTER ROWS AND COLUMNS WITHIN 20");
    }

    boolean isPrime(int n)
    {
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}