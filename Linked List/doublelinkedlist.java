public class doublelinkedlist {
    public static void main(String[] args)
    {
        dll a=new dll();
        a.insert(1, 10);
        a.insert(2, 20);
        a.insert(3, 30);
        a.insert(4, 40);
        a.insert(5, 50);
        a.insert(1, 80);
        a.insert(5, 90);
        a.insert(8, 300);
        a.insert(9, 99);
        a.insert(8, 900);
        a.insert(0,100);
        
        a.delete(7);
        a.delete(9);
        a.display();
        a.search(80);
        a.search(40);
        a.search(50);
        a.search(43);
        a.search(1000);
       
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

class dll{
   Node head=null;
   Node tail=null;
   public void insert(int pos, int data)
   {
    Node newnode=new Node(data);

    if(head==null)
    {
        head=newnode;
        return;
    }
    
    if (pos == 1)
    {
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        return;
    }

    Node cn=head;
    int count=1;
    while(cn!=null && count<pos-1)
    {
        cn=cn.next;
        count++;
        
    }
    if(cn==null || pos==0)
    {
        System.out.println("Position out of bounds.");
        return;
    }
    newnode.next=cn.next;
    newnode.prev=cn;
    cn.next=newnode;
   }

   public void delete(int pos1)
   {
    if(head==null)
    {
        System.out.println("Nothing to delete.");
        return;
    }
    if(pos1==1)
    {
        head=head.next;
        return;
    }
    Node crnode=head;
    Node prev=null;
    int count=1;
    while(crnode!=null && count<pos1)
    {
        prev=crnode;
        crnode=crnode.next;
        count++;
    }
    if(crnode==null)
    {
        System.out.println("Position out of bounds.");
        return;
    }
    prev.next=crnode.next;
    if(crnode.next!=null)
    crnode.next.prev=prev;

   }
   public void search(int ser)
   {
    if(head==null)
    {
        System.out.println("Empty list.");
        return;
    }
    Node cnode=head;
    int c=1;
    while(cnode!=null && cnode.data!=ser)
    {
        cnode=cnode.next;
        c++;
    }
    if(cnode==null)
    {
        System.out.println("Element not found.");
        return;
    }
    System.out.println("Position: "+c);
   }

   public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}