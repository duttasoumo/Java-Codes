import java.util.*;
class DIMENSIONS
{
    int nS;
    double sides[];
    double area;

    DIMENSIONS(int n)
    {
        nS=n;
        sides=new double[nS];
    }

    void read()
    {   Scanner sc=new Scanner(System.in);
        for(int i=0;i<nS;i++)
        {
            sides[i]=sc.nextDouble();
        }
    }
}