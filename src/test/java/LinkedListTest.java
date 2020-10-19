
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

}