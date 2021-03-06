public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(E data) {
        head = new Node(data);
    }
    private class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }
        public E getData() {
            return this.data;
        }
    }
    public void add(int index, E data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index -1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public E get(int index){
        Node temp = head;
        for(int i=0; i< index ; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
