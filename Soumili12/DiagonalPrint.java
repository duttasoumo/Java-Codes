import java.util.*;
class DiagonalPrint
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER ORDER OF MATRIX : ");
        int n=sc.nextInt();
        int d[][]=new int[n][n-1];
        int c=2,x=c,sr=1,sd=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                d[i][j]=x;
                x=x+sr;
                if(x==n)
                {sr=-1;x--;}
            }
            c=c+sd;
            if(c==n)
            {sd=-1;c--;}
            x=c;
        }
        int s=1,t=0,cpy;
        for(int i=0;i<n;i++)
        {   
            s=s+t;
            t++;
            cpy=s;
            for(int j=0;j<n;j++)
            {
                if(j==0)
                    System.out.print(s+" ");
                else
                { s=s+d[i][j-1];
                  System.out.print(s+" ");}
            }
            System.out.println();s=cpy;
        } 
    }
}