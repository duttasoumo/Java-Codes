class Triangle extends DIMENSIONS
{

    Triangle(int n) 
    { 
        super(n);
    }

    void calcArea()
    {   
        double s=sides[0]+sides[1]+sides[2];
        double area=Math.sqrt((s*(s-sides[0])*(s-sides[1])*(s-sides[2]))/2);
    }

    void display()
    {
        System.out.println("SIDE = "+sides[0]+"\nAREA = "+area);
    }
}
