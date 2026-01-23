package LinkedList.doublyLL;

public class DLL {
    private Node head;
    private Node tail;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head!=null){
            head.prev = node;
        }else{
            tail = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
       if (tail==null){
           insertFirst(val);
           return;
       }
       tail.next = node;
       node.prev = tail;
       node.next = null;
       tail = node;
    }

    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.println();
    }


    public void revDisplay(){
        Node temp = tail;

        while (temp!=null){
            System.out.print(temp.val+"->");
            temp = temp.prev;
        }
        System.out.println();
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }


}
