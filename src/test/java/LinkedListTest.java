
        import org.junit.Assert;
        import org.junit.Test;

public class LinkedListTest {
    /* UC 7 :
     *search element Test JUnit
     */
    @Test
    public void searchListTest() {
        // Code Here
        LinkedList list=new LinkedList();
        list.add(30);
        list.add(56);
        list.add(70);
//        list.display(list.head);
        Assert.assertTrue(list.searchList(list.head,30));

    }
    @Test
    public void testLinkedList() {
        // Code Here
        LinkedList list=new LinkedList();
        list.add(30);
        list.add(56);
        list.add(70);
        list.show(list.head);
        int pos=list.Insert(list.head,56);
        System.out.println("Pos is: "+pos);
        list.head=list.InsertPosition(list.head,pos,40);
        list.show(list.head);

    }

}