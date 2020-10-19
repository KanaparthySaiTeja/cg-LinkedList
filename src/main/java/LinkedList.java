public class LinkedList {
    Node head;
    public Node temp= null;
    public void add(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else{ //traversing and checking for null next
            Node tempnode=head;//initialising temp node as head i.e,first node
            while(tempnode.next!=null){
                tempnode=tempnode.next;//jumps to next node and stops where next is null
            }
            tempnode.next=node;//assigning node (which consists next as null) to tempnode (tempnode's next will become null now.)
        }
    }
    public void addAtStart(int data) {

        Node node = new Node(data);
        if (head == null) {

            head = node;
          Node temp =node;
        }
        else
        {
            Node temp = head;
            head = node;
            head.next = temp;
        }
    }
    //uc3
    public void append(int data) {

        Node newNode = new Node(data);
        if (head == null) {

            head = newNode;
            temp =newNode;
        }
        else
        {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }
    static Node GetNode(int data) {
        return new Node(data);
    }
    static Node InsertPosition(Node headNode, int position, int data) {
        Node head = headNode;
        if (position < 1)
            System.out.print("Invalid position");

        if (position == 1) {
            Node newNode = new Node(data);
            newNode.next = headNode;
            head = newNode;
        } else {
            while (position-- != 0) {
                if (position == 1) {
                    Node newNode = GetNode(data);
                    newNode.next = headNode.next;
                    headNode.next = newNode;
                    break;
                }
                headNode = headNode.next;
            }
            if (position != 1)
                System.out.print("Position out of range");
        }
        return head;
    }
    public void show(Node head)
    {
        Node node =head;
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }System.out.println(node.data);
    }
}
