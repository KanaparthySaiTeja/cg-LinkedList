public class LinkedList {
    Node head;
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
    public void show()
    {
        Node node =head;
        while(node.next!=null){
            System.out.println(node.data);
            node=node.next;
        }System.out.println(node.data);
    }
}
