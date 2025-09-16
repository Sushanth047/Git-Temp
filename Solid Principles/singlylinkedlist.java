
public class singlylinkedlist implements LinkedList{
    Node head=null;
    public void insert(int pos,int data)
    {
        Node new_node2=new Node(data);
        if(pos==1)
        { 
            if(head!=null){
            new_node2.next=head;}
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

    public void delete(int pos1)
    {
        if (head==null)
        {
            System.out.println("Nothing to delete.");
            return;
        }
        if(pos1==1)
        {
            head=head.next;
            return;
        }
        Node prev=null;
        Node crn=head;
        int count=1;
        while(crn!=null && count<pos1)
        {
            prev=crn;
            crn=crn.next;
            count++;
        }
        if (crn==null)
        {
            System.out.println("Position out of bounds.");
        }
        prev.next=crn.next;
    } 

    public void search(int ele)
    {
        
        if(head==null)
        {
            System.out.println("Empty list.");
            return;
        }
        Node current=head;
        int count=1;
        while(current!=null && current.data!=ele)
        {
            current=current.next;
            count++;
        }
        if(current==null)
        {
            System.out.println("Element not found");
            return;
        }
        System.out.println("Position: "+ count);
    }

    public void display(){
        Node temp=head;
        if(temp==null)
        {
            System.out.println("No data to display");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
}

