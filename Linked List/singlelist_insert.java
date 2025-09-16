
public class singlelist_insert {
    public static void main(String[] args)
    {
        singlylinkedlist sl= new singlylinkedlist();
        sl.insertatbegin(1);
        sl.insertatbegin(2);
        sl.insertatbegin(3);
        sl.insertatend(7);
        sl.insertatend(6);
        sl.insertatend(5);
        sl.insertatpos(4, 0);
        sl.deleteatbegin();
        sl.deleteatend();
        sl.deleteatpos(4);

        sl.display();
    }
}

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class singlylinkedlist{
    Node head=null;
    public void insertatbegin(int data){
        Node new_node=new Node(data);
    
    if(head==null){
        head=new_node;
        return;
    }
    new_node.next=head;
    head=new_node;
    }

    public void insertatend(int data){
        Node new_node1=new Node(data);
    
    if(head==null){
        head=new_node1;
        return;
    }
    Node current_node=head;
    while(current_node.next!=null){
        current_node=current_node.next;
    }
    current_node.next=new_node1;
    }

    public void insertatpos(int pos,int data)
    {
        Node new_node2=new Node(data);
        if(pos==0)
        {
            new_node2.next=head;
            head=new_node2;
            return;
        }

        Node cn=head;int count=1;
        while(cn!=null && count<pos-1)
        {
            cn=cn.next;
            count++;
        }

        if(cn==null)
        {
            System.out.println("Position out of list.");
            return;
        }
        new_node2.next=cn.next;
        cn.next=new_node2;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void deleteatbegin()
    {
        if(head==null)
        {
            System.out.println("Position out of list");
            return;
        }
        head=head.next;
    }

    public void deleteatend()
    {
        if(head==null)
        {
            System.out.println("Position out of list");
            return;
        }
        Node curnode=head;
        Node prev=null;
        while(curnode.next!=null)
        {
            prev=curnode;
            curnode=curnode.next;
        }
        prev.next=null;
    }

    public void deleteatpos(int pos1)
    {
        if(head==null)
        {
            System.out.println("Position out of list");
            return;
        }
        Node curnode1=head;
        Node prev=null;
        int count=1;
        while(curnode1!=null && count<pos1)
        {
            prev=curnode1;
            curnode1=curnode1.next;
            count++;
        }
        prev.next=curnode1.next;
        curnode1.next=null;
        
    }
}

