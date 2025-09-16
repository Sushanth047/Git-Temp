class Array {
    int[] a = new int[100];
    int n = 0;

    void insert(int x) {
        if (n < a.length) {
            a[n] = x;
            n++;
            System.out.println("Inserted: " + x);
        } else {
            System.out.println("Array is full");
        }
    }

    void delete(int x) {
        int i, pos = -1;
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            System.out.println("Element not found");
            return;
        }
        for (i = pos; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        n--;
        System.out.println("Deleted: " + x);
    }

    void display() {
        System.out.print("Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class operations {
    public static void main(String[] args) {
        Array a = new Array();

        a.insert(10);
        a.insert(20);
        a.insert(30);
        a.display();

        a.delete(20);
        a.display();
    }
}
