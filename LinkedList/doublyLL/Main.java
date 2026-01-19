package LinkedList.doublyLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(20);
        list.insertFirst(40);
        list.insertFirst(10);

        list.display();

        list.revDisplay();
    }
}
