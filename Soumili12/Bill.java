class Bill extends Detail
{
    int n;
    double amt;

    Bill(int n2,String n1,String a2,long t2,double r2)
    {
        super(n1,a2,t2,r2);
        n=n2;
        amt=0.0;
    }

    void cal()
    {
        if(n>=1&&n<=100)
         amt=rent;
         else if(n>100&&n<=200)
          amt=0.60+rent;
          else if(n>200&&n<=300)
           amt=0.80+rent;
            else if(n>300)
             amt=1.00+rent;
              else 
               System.out.println("INVALID INPUT");
    }
    
    void show()
    {
        super.show();
        System.out.println("NO.OF CALLS MADE : "+n+"\nAMOUNT TO BE PAID BY THE CUSTOMER :"+amt);
        
    }
    
    void main(String n1,int n2,String a2,long t2,double r2)
    {
        Bill b=new Bill(n2,n1,a2,t2,r2);
        b.cal();
        b.show();
    }
}