import com.homeworks.lessons3.ImitationArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ImitationArrayListTest {

    private ImitationArrayList list = new ImitationArrayList(5);

    @Before
    public void clearArray() {
        list.setArray(new int[2]);
    }

    @Test
    public void shouldAddElementToArray() {
        list.addElement(5);
        list.addElement(7);

        int[] array = list.getArray();



        Assert.assertEquals(array[0], 5);
        Assert.assertEquals(array[1], 7);

    }

    @Test
    public void shouldAddElementToArrayWhenValueIsZero() {
        list.addElement(0);

        int[] array = list.getArray();

        Assert.assertEquals(array[0], 0);
        Assert.assertEquals(array[1], 0);

    }

    @Test
    public void shouldResizeArray() {
        list.addElement(5);
        list.addElement(7);
        list.addElement(8);

        int[] array = list.getArray();

        Assert.assertEquals(4, array.length);
        Assert.assertEquals(8, array[2]);
        Assert.assertEquals(0, array[3]);

    }

    @Test
    public void shouldDeleteElementByIndex() {
        list.addElement(5);
        list.addElement(7);
        list.addElement(8);

        list.deleteElementByIndex(1);

        int[] array = list.getArray();

        Assert.assertEquals(3, array.length);
        Assert.assertEquals(5, array[0]);
        Assert.assertEquals(8, array[1]);

    }

    @Test
    public void shouldChangeElementByIndex() {
        list.addElement(5);
        list.addElement(7);
        list.addElement(8);

        list.changeElementByIndex(1, 4);

        int[] array = list.getArray();

        Assert.assertEquals(5, array[0]);
        Assert.assertEquals(4, array[1]);
        Assert.assertEquals(8, array[2]);
    }

    @Test
    public void shouldIncreaseArray() {
        list.addElement(5);
        list.addElement(7);
        list.addElement(8);

        list.increaseArray(3);

        int[] temp = list.getArray();

        Assert.assertEquals(5, temp[0]);
        Assert.assertEquals(7, temp.length);
        Assert.assertEquals(8, temp[2]);
        Assert.assertEquals(0, temp[3]);
        Assert.assertEquals(0, temp[4]);
    }

    @Test
    public void shouldDecreaseArray() {
        list.addElement(5);
        list.addElement(7);
        list.addElement(3);
        list.addElement(4);
        list.addElement(6);

        list.decreaseElement(1);

        int[] temp = list.getArray();

        Assert.assertEquals(7, temp.length);
    }

    @Test
    public void shouldConcatArray() {
        list.addElement(5);
        list.addElement(7);
        list.addElement(3);
        list.addElement(4);
        list.addElement(6);

        list.concat(new int[]{8, 1, 9});

        int[] temp = list.getArray();

       // Assert.assertTrue("null", null);
        Assert.assertEquals(7, temp.length);
        Assert.assertEquals(5, temp[0]);
        Assert.assertEquals(7, temp[1]);
        Assert.assertEquals(8, temp[5]);
        Assert.assertEquals(1, temp[6]);

    }

    @Test
    public void shouldSortDescending() {
        list.addElement(5);
        list.addElement(7);
        list.addElement(3);
        list.addElement(4);
        list.addElement(6);

        list.sortDescending();

        int[] array = list.getArray();

        Assert.assertEquals(7, array[0]);
        Assert.assertEquals(5, array[1]);
        Assert.assertEquals(4, array[2]);

        // check only three first positions
    }

    @Test
    public void shouldSortAscending() {//refactoring
        list.addElement(5);
        list.addElement(7);
        list.addElement(3);
        list.addElement(4);
        list.addElement(6);

        list.sortAscending();

        int[] array = list.getArray();

        Assert.assertEquals(7, array[1]);
        Assert.assertEquals(6, array[4]);
        Assert.assertEquals(5, array[0]);
        Assert.assertEquals(4, array[3]);
        Assert.assertEquals(3, array[2]);

    }

    @Test
    public void shouldDeleteDuplicate() {//refactoring
        list.addElement(5);
        list.addElement(7);
        list.addElement(5);
        list.addElement(4);
        list.addElement(6);

        list.deleteDuplicate();

        int[] array = list.getArray();

        Assert.assertEquals(7, array[1]);
        Assert.assertEquals(0, array[4]);
        Assert.assertEquals(5, array[0]);
        Assert.assertEquals(6, array[3]);
        Assert.assertEquals(4, array[2]);
        //System.out.println();
    }

}
