import java.io.*;
class LinkedList
{  
    node start;

    LinkedList()
    { 
        start=null;
    } 

    void print()
    { 
        node ptr=start;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");System.out.println();
            ptr=ptr.next;
        } 
    }

    void addfirst(int d)
    { 
        node ptr=new node(d);
        if(start==null)
            start=ptr;

        else
        { 
            ptr.next=start;
            start=ptr;

        } 
    } 

    void addlast(int d)
    { 
        node ptr=new node(d);
        if(start==null)
            start=ptr;

        else
        {  
            node q=start;
            while(q.next!=null)
                q=q.next;
            q.next=ptr;

        } 
    }

    int count()
    {  
        if(start==null)
        {System.out.println("No list");
            return 0;
        }

        else
        {   int c=1;
            for(node ptr=start;ptr.next!=null;c++,ptr=ptr.next);

            return c;
        } 
    } 

    void addmiddle(int d,int p)
    { 
        node ptr=new node(d);
        int c=count();

        if(p==0||p>c) System.out.println("Not possile");

        else
        { 
            int ctr=1;node pt=start;
            for(;ctr<p;pt=pt.next,ctr++);

            ptr.next=pt.next;
            pt.next=ptr;
        }  
    } 

    void delfirst()
    { 
        if(start==null) System.out.println("no node");
        else
        { 
            node ptr=start;
            start=start.next;
            ptr.next=null;
        } 
    } 

    void dellast()
    {   node p=start,q=start;
        if(start==null) System.out.println("No list");
        else
        { 
            for(;q.next!=null;p=q,q=q.next);

            p.next=null;
        } 
    } 

    void delmiddle(int p)
    { 
        int c=count(),ctr=1;
        if(p==0||p>c) System.out.println("No list");

        else
        { 
            node ptr=start;
            while(ctr<p-1)
            { 
                ctr++;ptr=ptr.next;
            } 
            node q=ptr.next;
            ptr.next=ptr.next.next;
            q=null;
        } 
    } 

    public static void main()throws IOException
    {  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        LinkedList l=new LinkedList();int ch,d,p;
        do
        { 
            System.out.println("1.addfirst\n2.addlast\n3.addmiddle\n4.delfirst\n5.dellast\n6.delmiddle\n7.print\n8.exit\nEnter ur choice");

            ch=Integer.parseInt(br.readLine());
            switch(ch)
            { 
                case 1:System.out.println("Enter the info");
                d=Integer.parseInt(br.readLine());
                l.addfirst(d);break;

                case 2:System.out.println("Enter the info");
                d=Integer.parseInt(br.readLine());
                l.addlast(d);break; 

                case 3:System.out.println("Enter the info");
                d=Integer.parseInt(br.readLine());
                System.out.println("Enter the position");
                p=Integer.parseInt(br.readLine());
                l.addmiddle(d,p);break;  

                case 4:l.delfirst();break;
                case 5:l.dellast();break;
                case 6:System.out.println("Enter the position");
                p=Integer.parseInt(br.readLine());
                l.delmiddle(p);break;
                case 7:l.print();break;       
                case 8:break;
                default:System.out.println("Wrong choice");
            } 
        }while(ch!=8);
    } //main
}//class
