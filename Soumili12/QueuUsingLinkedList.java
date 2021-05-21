
import java.util.*;
class QueuUsingLinkedList
{  
    node start;

    QueuUsingLinkedList()
    { 
        start=null;
    } 

    void display()
    { 
        node ptr=start;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");System.out.println();
            ptr=ptr.next;
        } 
    }

    void addFirst(int d)
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

    void delFirst()
    { 
        if(start==null)
            System.out.println("no node");
        else
        { 
            node ptr=start;
            start=start.next;
            ptr.next=null;
        } 
    } 

    void main()
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        QueuUsingLinkedList ob=new QueuUsingLinkedList();
        do{
            System.out.println("ENTER CHOICE :\n1-to add at the beginning\n2-to delete at the beginning\n3-to display the linkedlist\n4-to exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:int d;
                System.out.println("ENTER DATA");
                d=sc.nextInt();
                ob.addFirst(d);
                break;
                case 2:ob.delFirst();
                break;
                case 3:System.out.println("DISPLAYING LINKED LIST :");
                ob.display();
                break;
                case 4:System.exit(1);
            }
        } while(ch!=4);
    }
}