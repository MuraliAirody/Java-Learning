package LinkedList;

import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {

        LL list = new LL();

        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(1);

        list.insertLast(100);
        list.insertFirst(0);
        list.insertLast(101);

        list.insert(11,3);

        list.display();

        java.util.OptionalInt delFirst = list.deleteFirst();

        System.out.println(delFirst.isEmpty()?"Linked list is empty":delFirst.getAsInt());

        list.display();

        java.util.OptionalInt delLast = list.deleteLast();
        System.out.println(delLast.isEmpty()?"Linked list is empty":delLast.getAsInt());

        list.display();

        OptionalInt delPos = list.deletePos(3);
        System.out.println(delPos.isEmpty()?"Linked list is empty":delPos.getAsInt());

        list.display();
    }
}
