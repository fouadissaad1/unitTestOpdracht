import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(Arrays.asList("blabla , <b>, bla, </b>"), Arrays.asList(arr1));
    }
}
