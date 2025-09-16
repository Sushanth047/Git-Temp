public class op {
    public static void main(String[] args)
    {
        stackarray s= new stackarray(2);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(50);
        s.pop();
        s.pop();
        s.display();
    }
}
    class stackarray{
        int top;
        int capacity;
        int[] stack;

        public stackarray(int size)
        {
            stack=new int[size];
            capacity=size;
            top=-1;
        }

        public void push(int data)
        {
            if(isfull())
            {
                System.out.println("Stack overflow, cannot push data.");
                return;
            }
            stack[++top]=data;
            System.out.println(data + " pushed to stack.");

        }

        public void pop() {
        if (isempty()) {
            System.out.println("Stack Underflow! Nothing to pop");
            return;
        }
        int popped = stack[top--]; 
        System.out.println(popped + " popped from stack");
    }
    
        public void peek(){
            if(isempty())
            {
                System.out.println("Empty stack, nothing to peek.");
                return;
            }
            System.out.println("Top element of the stack is: "+ stack[top]);
        }

        public boolean isfull(){
            return top==capacity-1;
        }

        public boolean isempty(){
            return top==-1;
        }

        public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i] + " ");
        }
        System.out.println();
    }
}
