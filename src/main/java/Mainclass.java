public class Mainclass {
    public static void main(String[] args) {
        LinkedList List=new LinkedList();
        Node head = LinkedList.GetNode(56);
        head.next = LinkedList.GetNode(30);
        head.next.next = LinkedList.GetNode(70);

        System.out.print("Before: ");
        List.show(head);
        System.out.print("After: ");
        head = LinkedList.deleteFirst(head);
        List.show(head);
    }
}
