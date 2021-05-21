import java.util.*;
import java.text.DateFormat;
class Agecalc2

{
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        String date;
        System.out.print("ENTER DATE IN dd/mm/yyyy FORMAT : ");
        date=sc.nextLine();
        int d,m,y;
        d=Integer.parseInt(date.substring(0,2));
        m=Integer.parseInt(date.substring(3,5));
        y=Integer.parseInt(date.substring(6));
        
        if(!(d>=1&&d<=31&&m>=1&&m<=12&&countDigi(y)==4))
        return;
        DateFormat df=DateFormat.getDateInstance(DateFormat.LONG);
        Date date1=new Date();
        String today=df.format(date1);
        int d1,m1=0,y1;
        System.out.print(today);
        String a[]=today.split(" ,");
        String mn[]={" ","january","february","march","april","may","june","july","august","september","october","november","december"};
        d1=Integer.parseInt(a[0]);
        y1=Integer.parseInt(a[2]);
        for(int i=1;i<12;i++)
        if(a[1].equalsIgnoreCase(mn[i]))
        {m1=i;}
        int ar[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int yd=0,md=0,dd=0;
        if(isLeap(y)==true)
        ar[2]++;
        if(m1>m)
        {
            yd=y1-y;
            if(d1>=d)
            {   md=m1-m;
                dd=d1-d;
            }
            else
            {   md=(m1-1)-m;
                dd=ar[m1-1]-d+d1;
            }
        }
        else if(m1==m)
        {
            if(d1>=d)
            {   yd=y1-y;
                md=m1-m;
                dd=d1-d;
            }
            else
            {   yd=(y1-1)-y;
                md=11;
                dd=365-(d1-d);
            }
        }
        else //m1<m
        {   yd=(y1-1)-y;
            if(d1>=d)
            {   md=12+m1-m;
                dd=d1-d;
            }
            else
            {   md=12+m1-m-1;
                dd=ar[m1-1]-d+d1;
            }
        }
        System.out.println("CALCULATED AGE IS : \n"+yd+" years "+md+" months "+dd+" days ");
    }
                
    int countDigi(int y)
    {   int c=0,d;
        while(y>0)
        {   d=y%10;
            c++;
            y/=10;
        }
        return c;
    }
    
    boolean isLeap(int y)
    {
        if(y%100==0||(y%4==0&&y%100!=0))
        return true;
        return false;
    }
}               