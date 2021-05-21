class Square extends DIMENSIONS
{

    Square(int n) 
    { 
        super(n);
    }

    void calcArea()
    {   
       double area=sides[0]*sides[0];
    }

    void display()
    {
        System.out.println("SIDE = "+sides[0]+"\nAREA = "+area);
    }
}
