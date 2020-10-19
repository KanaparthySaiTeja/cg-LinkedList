
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
    //uc8
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
    //uc9
    @Test
    public void testLinkedList_remove_insertednode() {
        // Code Here
        LinkedList list=new LinkedList();
        list.add(30);
        list.add(40);
        list.add(56);
        list.add(70);
        list.show(list.head);
        int total1=list.length();
        System.out.println("List Length: "+total1);
        list.head=list.removeValue(list.head,40);
        list.show(list.head);
        int total2=list.length();
        System.out.println("List Length: "+total2);
        Assert.assertEquals(3,total2);
    }

}