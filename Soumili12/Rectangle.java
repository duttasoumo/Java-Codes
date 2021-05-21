import java.util.*;
class Rectangle extends Shape
{
    double length,breadth;

    double calcArea()
    {
        return length*breadth;
    }

    public void display()
    {
        System.out.println("Length = "+length);
        System.out.println("Breadth = "+breadth);
        System.out.println("Area = "+calcArea());
    }

    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth");
        length=sc.nextDouble();
        breadth=sc.nextDouble();
        Rectangle ob=new Rectangle();
        ob.calcArea();
        ob.display();
    }
}