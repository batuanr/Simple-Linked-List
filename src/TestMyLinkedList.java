import java.util.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList(2);
        list.printList();
        list.addFirst(4);
        list.addFirst(46);
        list.addFirst(6);
        list.addFirst(7);
        list.printList();
        list.add(2,99);
        list.printList();
//        list.get(3);
        System.out.println(list.get(2));

    }
}
