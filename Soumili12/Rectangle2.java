class Rectangle2 extends DIMENSIONS
{

    Rectangle2(int n) 
    { 
        super(n);
    }

    void calcArea()
    {   
        double area=sides[0]*sides[1];
    }

    void display()
    {
        System.out.println("SIDE = "+sides[0]+"\nAREA = "+area);
    }
}
