import java.util.*;
class Array2d
{
    public static void main()
    {
        Scanner sc=new Scanner (System.in);
        int n;
        System.out.print("ENTER ORDER OF MATRIX(WITHIN 10) : ");
        n=sc.nextInt();
        if(n>10)
        {System.out.print("\nSIZE OUT OF RANGE");
            System.exit(1);
        }
        char ar[]=new char[n];
        System.out.print("INPUT : FIRST CHARACTER ");
        char ch1=sc.nextChar();
        System.out.print("\tSECOND CHARACTER ");
        char ch2=sc.nextChar();
        System.out.print("\tTHIRD CHARACTER ");
        char ch3=sc.nextChar();
        
        