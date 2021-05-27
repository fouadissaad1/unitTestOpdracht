import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MarkDownTest {
    @Test
    public void printArry(){
        MarkDown markDown=new MarkDown();
         String[] array = {"blabla bla"};
         String[] expected = markDown.format( "blabla bla");
         assertArrayEquals(array, expected);
    }



}
