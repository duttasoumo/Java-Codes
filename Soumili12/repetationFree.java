import java.util.*;
class repetationFree
{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("ENTER A NUMBER : ");
        n=sc.nextInt();
        for(int i=n+1;;i++)
        {
            if(isRepetationFree(i)==true)
            { System.out.print(i);break;}
            else
                continue;
        }
    }

    boolean isRepetationFree(int n)
    {
        int a=1;int d;
	   int arr[] = new int[10];
        while(n!=0)
        {
            d=n%10;
            if(d==0)
                return false;
		 if(arr[d]==1)
			return false;
		 arr[d]++;
            n=n/10;
	   }
        return true;
    }
}	
