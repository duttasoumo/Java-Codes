import java.util.*;
class combination
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A WORD WITH MAXIMUM 7 LETTERS");
        String str=sc.nextLine();
        int i,j,k,l=str.length();
        int low=0,high=0;
        for(i=1;i<=l;i++)
        {
            low=low*10+i;
            high=high*10+(1-i+1);
        }
        System.out.println(low+" "+high);
        String c=String.valueOf(low);
        for(i=low;i<=high;i++)
        {   String b=String.valueOf(i);
            for(j=0;j<b.length();j++)
                if(b.indexOf(c.charAt(j))==-1)
                    break;
            
            