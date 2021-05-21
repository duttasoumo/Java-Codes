import java.util.Scanner;
class Encryption
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE STRING TO BE ENCRYPTED IN UPPERCASE : ");
        String str=sc.nextLine().trim(),temp2;
        String ar[]=str.split(" ");
        int a[]=new int[ar.length],temp;
        Encryption ob=new Encryption();
        for(int i=0;i<ar.length;i++)
        {
            a[i]=ob.potential(ar[i]);
        }
        //printing the words alongwith their potential
        for(int i=0;i<ar.length;i++)
        {   System.out.print(ar[i]+"\t= "+a[i]);
            System.out.println();
        }
        //arranging the words using bubble sort
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];temp2=ar[j];
                    a[j]=a[j+1];ar[j]=ar[j+1];
                    a[j+1]=temp;ar[j+1]=temp2;
                }
            }
        }
        for(int i=0;i<ar.length;i++)
            System.out.print(ar[i]+" ");
    }

    int potential(String w)
    {
        int l=w.length();int c=0,p;char ch;
        for(int i=0;i<l;i++)
        {
            ch=w.charAt(i);
            p=(int)ch-64;
            c+=p;
        }
        return c;
    }
}
