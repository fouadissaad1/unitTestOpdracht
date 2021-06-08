import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MarkDownTest {

    @Test
    public void printformat(){
        MarkDown markDown= MarkDown();
        String[] arr1 = markDown.format("blabla bla");
        String[] arr2 = markDown.format("blabla bla");
        assertArrayEquals(arr1,arr2);
    }
}
