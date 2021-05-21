import java.util.*;
class Partition
{
    public static void partition(int n)
    {
        partition(n,n," ");
    }

    public static void partition(int n,int max,String prefix)
    {
        if(n==0)
        {
            System.out.println(prefix);
            return;
        }
        for(int i=Math.min(max,n);i>=1;i--)
            partition(n-i,i,prefix+" "+i);
    }

    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER TO BE PARTITIONED ");
        int n=sc.nextInt();
        System.out.println("ALL POSSIBLE PARTITIONS OF "+n+" ARE : ");
        partition(n);
    }
}

    