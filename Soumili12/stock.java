class stock
{
    String item;
    int qty;
    double rate;
    double amt;

    stock(String ni,int nqty,double nrate)
    {   item=ni;
        qty=nqty;
        rate=nrate;
    }

    void display()
    {
        System.out.println("ITEM-"+item+"\nQTY.-"+qty+"\nRATE-"+rate+"\nAMOUNT-"+(qty*rate));
    }
}

