import java.util.*;
class Purchase extends stock
{
    int pqty;
    double prate;

    Purchase(int npqty,double nprate,String ni,int nqty,double nrate)
    {
        super(ni,nqty,nrate);
        pqty=npqty;
        prate=nprate;
    }
    void update()
    {
        pqty=qty+pqty;
        if(prate!=rate)
            prate=rate;
    }

    void display()
    {
        System.out.println("BEFORE UPDATION : ");
        super.display();
        System.out.println("AFTER UPDATION : ");
        System.out.println("QTY-"+pqty+"\nRATE-"+prate+"\nAMOUNT-"+(pqty*prate));
    }
    
    void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER quatity,rate,name of the item,new qty.,new rate");
        int npqty=sc.nextInt();
        double prate=sc.nextDouble();
        String nItem=sc.nextLine();
        int nqty=sc.nextInt();
        double nrate=sc.nextDouble();
        Purchase P=new Purchase(npqty,prate,nItem,nqty,nrate);
        P.update();
        P.display();
    }
}
    
