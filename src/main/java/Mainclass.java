public class Mainclass {
    public static void main(String[] args) {
        LinkedList List=new LinkedList();
        Node head = LinkedList.GetNode(56);
        head.next = LinkedList.GetNode(30);

        System.out.println("Before insertion: ");
        List.show(head);

        int data = 12, pos = 2;
        head = LinkedList.InsertPosition(head, pos, data);
        System.out.println("After Insertion: ");
        List.show(head);
    }
}
