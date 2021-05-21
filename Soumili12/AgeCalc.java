import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AgeCalc 
{	int b[],c[];
    public AgeCalc(){
        b=new int[3];
        c=new int[3];
    }

    void input(String bd,String cd){
        StringTokenizer birth=new StringTokenizer(bd,"/");
        StringTokenizer current=new StringTokenizer(cd,"/");
        for(int i=0;i<3;i++)
        {b[i]=Integer.parseInt(birth.nextToken());
            c[i]=Integer.parseInt(current.nextToken());
        }
    }

    String calc()
    {   int m[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(c[2]%100==0){
            if(c[2]%400==0)m[2]++;
        }else if(c[2]%4==0)m[2]++;

        int yr=c[2]-b[2];
        int mon=c[1]-b[1];
        if(mon<0){
            yr--;
            mon+=12;
        }
        int days=c[0]-b[0];
        if(days<0){
            mon--;
            days+=m[c[1]-1];
        }

        return yr+" years, "+mon+" months and "+days+" days";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter birthday in dd/mm/yyyy format :");
        String s1=sc.nextLine();
        sc.close();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dateobj = new Date();
        String s2=df.format(dateobj);
        AgeCalc ob =new AgeCalc();
        ob.input(s1, s2);
        System.out.println("\nAGE : "+ob.calc());
    }

}
