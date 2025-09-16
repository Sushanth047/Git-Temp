import java.util.Scanner;

public class insertion {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        LinkedList sl= (LinkedList) new singlylinkedlist();

        while(true)
        {
            System.out.println("\nChoose Operation: ");
            System.out.println("1, Insert");
            System.out.println("2, Delete");
            System.out.println("3, Search");
            System.out.println("4, Display");
            System.out.println("5, Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter position to insert at: ");
                    int pos = sc.nextInt();
                    System.out.print("Enter data to insert: ");
                    int data = sc.nextInt();
                    sl.insert(pos,data);
                    break;
                case 2:
                    System.out.print("Enter position to delete: ");
                    int pos1 = sc.nextInt();
                    sl.delete(pos1);
                    break;
                case 3:
                    System.out.print("Enter data to search: ");
                    int ele = sc.nextInt();
                    sl.search(ele);
                    break;
                case 4:
                    sl.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
        }
        // sl.insert(1, 10);
        // sl.insert(2, 20);
        // sl.insert(3, 30);
        // sl.insert(4, 40);
        // sl.insert(5, 50);
        // sl.insert(1, 80);
        // sl.insert(5, 90);
        // sl.delete(4);
        // sl.delete(1);
        // sl.display();
        // sl.search(40);
        // sl.search(10);
        // sl.search(87);
        
    }
}
}

