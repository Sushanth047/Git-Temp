public class circularlinkedlist {

    public static void main(String[] args)
    {
        cll a=new cll();
        a.insertion(1, 5);
        a.insertion(2, 6);
        a.insertion(3, 9);
        a.insertion(1, 13);
        a.insertion(3, 15);
        a.insertion(6, 18);
        a.insertion(6, 17);
        a.insertion(1, 3);
        System.out.println("Insertion: ");
        a.display();
        a.deletion(1);
        a.deletion(2);
        a.deletion(4);
        a.insertion(6, 20);
        a.deletion(1);
        System.out.println("Deletion: ");
        a.display();
        a.search(15);
        a.search(6);
        a.search(17);
        a.search(18);
        a.search(20);
        a.search(30);
        // a.insert(3, 7);
        // a.insert(4, 8);
        // a.insert(5, 9);
    }
}
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class cll{
    Node head=null;
    public void insertion(int pos, int data)
    {
        Node newnode=new Node(data);
         if (pos == 1) {
        if (head == null) {
            head = newnode;
            newnode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newnode.next = head;
            temp.next = newnode;
            head = newnode;
        }
    
        // Node last=head;
        // while(last.next!=head)
        // {
        //     last=last.next;
        // }
        // last.next=newnode;
        // newnode.next=head;
        // head=newnode;
        // return;
     }
        else {
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
}

        // else{
        //     Node temp=head;
        //     while(temp.next!=null)
        //     {
        //         temp=temp.next;
        //     }
        //     newnode.next = temp.next;
        //     temp.next = newnode;
        // }
    


// class cll{
//     Node head=null;
//     Node tail=null;
//     public void insert(int pos, int data)
//     {
//         Node newnode=new Node(data);
//         if(head==null)
//         {
//             head=newnode;
//             newnode.next=head;
//             return;
//         }
//         if(pos==1) //insert at beginning
//         {
            // newnode.next=head;
            // head.prev=newnode;
            // if(head==tail)
            // {
            // head.next=newnode;
            // newnode.prev=head;
            // return;
            // }
            // head=newnode;
            // newnode.prev=tail;
            // tail.next=head;
            // return;

        //     newnode.next=head;
        //     head.next=newnode;
        //     head=newnode;
        //     return;
        // }

        // Node cnode=head;
        // Node pnode=head;
        // int c=1;
        // while(cnode.next!=null && c<pos)
        // {
        //     pnode=cnode;
        //     cnode=cnode.next;
        //     c++;
        // }
        // if(cnode==null)
        // {
        //     System.out.println("Position out of bounds.");
        //     return;
        // }
        // if(pnode==tail)
        // {
        //     tail.next=newnode;
        //     newnode.prev=tail;
        //     tail=newnode;
        //     tail.next=head;
        //     head.prev=tail;
        // }
        // if(cnode==pnode)
        // {
        //     newnode.next=pnode.next;
        //     newnode.next.prev=newnode;
        //     newnode.prev=pnode;
        //     pnode.next=newnode;
        // }
        // pnode.next=newnode;
        // newnode.prev=pnode;
        // newnode.next=cnode;
        // cnode.prev=newnode;
    

   public void deletion(int pos)
   {
    Node temp=head;
    if(head==null || pos==0)
    {
        System.out.println("Nothing to delete");
        return;
    }
    if(pos==1)
    {
        if(temp.next==head)
        {
            temp.next=null;
            return;
        }
        else{
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
        return;
    }
    }

    else{
        temp=head;
        int c=1;
        Node pnode=null;
        while(temp.next!=head && c<pos)
        {
            pnode=temp;
            temp=temp.next;
            c++;
        }
        if(temp.next==head)
        {
            temp.next=null;
            pnode.next=head;
            return;
        }
        else{
            pnode.next=temp.next;
            temp.next=null;
            return;
        }
    }
   }
   
public void search(int x)
{
    Node temp=head;
    int pos=1;
    while(temp.next!=head)
    {
        if(temp.data==x)
        {
            System.out.println("Position : " + pos);
            return;
        }
        temp=temp.next;
        pos++;
    }
    if(temp.next==head)
    {
        if(temp.data==x)
        {
            System.out.println("Position : " + pos);
            return;
        }
    
    else{
    System.out.println("Element not found");
}
    }
}

   public void display() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    // Node temp = head;
    // while(temp!=head)
    // {
    //     System.out.println(temp.data + "");
    //     temp=temp.next;
    // }

    Node temp=head;
    do {
        System.out.print(temp.data + " ");
        temp = temp.next;
    } while (temp != head);
    System.out.println();
}
}
