import java.util.*;
class Area extends Perimeter
{
    double h;
    double area;

    Area(double na,double nb,double nh)
    {
        super(na,nb);
        h=nh;
    }

    void doArea()
    {
        area=b*h;
    }

    void show()
    {super.show();
        System.out.println("HEIGHT OF THE PARALLELOGRAM "+h);
        System.out.println("AREA OF THE PARALLELOGRAM "+area);
    }
    
    void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER length,breadth,height");
        double na=sc.nextDouble();
        double nb=sc.nextDouble();
        double nh=sc.nextDouble();
        Area a=new Area(na,nb,nh);
        a.doArea();
        a.show();
    }
}