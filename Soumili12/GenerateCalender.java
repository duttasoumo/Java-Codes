import java.util.*;
class GenerateCalender
{
    String s;
    int y;
    public GenerateCalender(String s1,int y1)
    {   s=s1;
        y=y1;
    }

    public boolean isLeap()
    {
        int yr=y;
        if(yr%400==0||yr%100!=0&&yr%4==0)
            return true;
        return false;
    }

    public String firstDay(String fd,int n)//returns first day of each month
    {
        int j,d=1,i=0,m;
        int cal[][]=new int[5][7];
        String dd[]={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        for(j=0;j<7;j++)
        {   if(fd.equalsIgnoreCase(dd[j])==true)
                break;
        }
        cal[i][j]=d;
        while(++d<=n)
        {   j++;
            if(j==7)
            {j=0;i++;}
            if(i==5)
            {i=0;j=0;}
            cal[i][j]=d;
        } j++;
        if(j==7)
            j=0;
        for(i=0;i<5;i++)
        {
            for(m=0;m<7;m++)
                System.out.print("\t"+(cal[i][m]==0?" ":cal[i][m])+"\t");
            System.out.println("\t");
        }
        return dd[j];
    }

    public  void dayOfDate() //generates the year calender
    {
        int i;
        String dy=s;
        int p[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String m[]={"january","february","march","april","may","june","july","august","september","october","november","december"};
        if(isLeap()==true)
            p[1]=29;
        System.out.println("\t sunday \t monday \t tuesday \t wednesday \t thursday \t friday \t saturday");
        for(i=0;i<12;i++)//prints the calender for each month 
        {   System.out.println(m[i]);
            dy=firstDay(dy,p[i]);
        }
    }

    public static void main()
    {
        String day1;
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE 1st DAY OF JANUARY ALONGWITH THE YEAR");
        day1=sc.nextLine();
        y=sc.nextInt();
        GenerateCalender gc=new GenerateCalender(day1,y);
        gc.dayOfDate();
    }
}