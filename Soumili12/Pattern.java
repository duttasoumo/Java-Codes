import java.util.*;
class Pattern
{
    public static void main()
    {   Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("ENTER A WORD WITH ODD NUMBER OF LETTERS : ");
        str=sc.nextLine();
        if(str.length()%2==0)
        {System.out.println("WRONG INPUT"); System.exit(0);}
        int i,j,k=1;
        int n=str.length();
        System.out.println("\nPATTERN : \n");
        for(i=0;i<n;i++)
            System.out.print(str.charAt(i));
        System.out.println();    

        for(i=n/2-1;i>0;i--)
        {
            for(j=0;j<=i;j++)
                System.out.print(str.charAt(j));
            for(j=1;j<=k;j++)
                System.out.print(" ");
            k+=2;
            for(j=i;j>=0;j--)
                System.out.print(str.charAt(n-1-j));
            System.out.println();
        }
        k=str.length()-4;
        for(i=n/2-1;i>=0;i--)
        {
            for(j=n/2;j>i;j--)
                System.out.print(str.charAt(n/2-j));
            for(j=0;j<=k+1;j++)
                System.out.print(" ");
            k-=2;
            for(j=i+n/2+1;j<n;j++)
                System.out.print(str.charAt(j));
            System.out.println();
        }
        for(i=0;i<n;i++)
            System.out.print(str.charAt(i));
        System.out.println();

    }
}
