import java.util.*;
class Circle2 extends Shape
{
    double radius;

    double calcArea()
    {
        return 3.154*radius*radius;
    }

    public void display()
    {
        System.out.println("Radius = "+radius);
        System.out.println("Area = "+calcArea());
    }

    public void main()
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Enetr radius");
        radius=sc.nextDouble();
        Circle2 ob=new Circle2();
        ob.calcArea();
        ob.display();
    }
}
