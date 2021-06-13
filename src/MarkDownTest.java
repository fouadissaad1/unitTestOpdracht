import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MarkDownTest {

    @Test
    public void printformat(){
        MarkDown markDown= new MarkDown();
        assertArrayEquals(new String[]{"blabla bla"},markDown.format("blabla bla"));
    }

    @Test
    public void printSlistArray() {
        MarkDown markDown = new MarkDown();
        String[] arr1 = markDown.format("blabla *bla*");
        assertArrayEquals(new String[]{"blabla ", "<b>", "bla", "</b>"}, arr1);
    }

    @Test
    public void printOtherArray() {
        MarkDown markDown = new MarkDown();
        String[] arr1 = markDown.format("*blabla* bla");
        assertArrayEquals(new String[]{"", "<b>", "blabla", "</b>", " bla"}, arr1);
    }
}
