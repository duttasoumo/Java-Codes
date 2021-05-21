import java.util.*;
class circle extends plane
{
    int x2,y2;
    double radius,area;

    circle(int nx,int ny,int mx,int my)
    {
        super(nx,ny);
        x2=mx;
        y2=my;
    }

    void findRadius()
    {
      radius=(Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)))/2;
    }

    void findArea()
    {
        area=3.14*radius*radius;
    }

    void show()
    {
        super.show();
        System.out.println(x2+","+y2+"\nRadius "+radius+"\nArea "+area);
    }

    void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER x1,y1,x2,y2");
        int nx=sc.nextInt();
        int ny=sc.nextInt();
        int mx=sc.nextInt();
        int my=sc.nextInt();
        circle c=new circle(nx,ny,mx,my);
        c.findRadius();
        c.findArea();
        c.show();
    }
}
