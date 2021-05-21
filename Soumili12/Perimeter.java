class Perimeter
{
    double a;
    double b;

    Perimeter(double na,double nb)
    {
        a=na;
        b=nb;
    }
    
    double calculate()
    {return 2*(a+b);
    }
    
    void show()
    {
        System.out.println("LENGTH OF THE PARALLELOGRAM "+a);
        System.out.println("BREADTH OF THE PARALLELOGRAM "+b);
        System.out.println("PERIMETER OF THE PARALLELOGRAM "+calculate());
    }
}

