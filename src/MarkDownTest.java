import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MarkDownTest {

    @Test
    public void printformat(){
        MarkDown markDown= new MarkDown();
        assertArrayEquals(new String[]{"blabla bla"},markDown.format("blabla bla"));
    }
}
