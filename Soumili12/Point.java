import java.util.*;
class Point
{
    int x;
    int y;

    Point()
    {
        x=0;
        y=0;
    }

    float calcSlope(Point p)
    {
        float slope=(p.y-this.y)/(p.x-this.x);
        return slope;
    }

    void acceptFirst()
    {   
        Scanner sc=new Scanner(System.in);
        System.out.print("\nENTER A POINT:\nOrdinate : ");
        x=sc.nextInt();
        System.out.print("Abscissa : ");
        y=sc.nextInt();
    }

    Point midPoint(Point p,Point q)
    {
        int x,y;
        this.x=(p.x+q.x)/2;
        this.y=(p.y+q.y)/2;
        return this;
    }

    void display()
    {
        System.out.println("The point is : ("+x+","+y+")" );
    }

    void main()
    {   Scanner sc=new Scanner(System.in);
        Point ob=new Point();
        Point ob1=new Point();
        System.out.println("ENTER POINT FOR TWO LINES : ");
        ob.acceptFirst();
        ob1.acceptFirst();
        if(calcSlope(ob)==calcSlope(ob1))
            System.out.println("\nTHE TWO LINES ARE PARALLEL!");
        else
            System.out.println("\nTHE TWO LINES ARE NOT PARALLEL!");
        midPoint(ob,ob1).display();
    }
}
