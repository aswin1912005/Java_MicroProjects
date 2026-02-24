// Author : Aswin

class Arrays {
    int a[];
    int size, capacity;

    // Create
    Arrays(int capacity) {
        this.capacity = capacity;
        a = new int[capacity];
        size = 0;
    }

    // Add element
    boolean add(int ele) {
        if (size >= capacity) {
            System.out.println("Array is Full");
            return false;
        }
        a[size] = ele;
        size++;
        return true;
    }

    // Insert at specific index
    boolean insert(int index, int ele) {
        if (index < 0 || index > size || size >= capacity) {
            System.out.println("Invalid index");
            return false;
        }

        for (int i = size; i > index; i--) {
            a[i] = a[i - 1];
        }

        a[index] = ele;
        size++;
        return true;
    }

    // Delete from index
    boolean delete(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            a[i] = a[i + 1];
        }

        size--;   
        return true;
    }

    // Display
    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Arrays obj = new Arrays(5);

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);

        System.out.print("Before Delete: ");
        obj.display();

        obj.delete(0); 

        System.out.print("After Delete: ");
        obj.display();
    }
}
