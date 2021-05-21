import java.util.*;
class StackUsingLinkedList
{  
    node start;

    StackUsingLinkedList()
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

    void addLast(int d)
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
        StackUsingLinkedList ob=new StackUsingLinkedList();
        do{
            System.out.println("ENTER CHOICE : 1-to add at the end\n2-to delete at the beginning\n3-to display the linkedlist\n4-to exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:int d;
                System.out.println("ENTER DATA");
                d=sc.nextInt();
                ob.addLast(d);
                break;
                case 2:ob.delFirst();
                break;
                case 3:System.out.println("DISPLAYING LINKED LIST :");
                ob.display();
                break;
                case 4:break;
            }
        } while(ch!=4);
    }
}
