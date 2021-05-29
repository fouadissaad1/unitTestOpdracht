import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MarkDownTest {
    @Test
    public void printArry(){
        MarkDown markDown=new MarkDown();
        String[] array = markDown.format( "blabla bla");
         String[] expected = {"[blabla bla]"};
        assertArrayEquals(expected, array);
    }


    @Test
    public void printSplistArray(){
        MarkDown markDown=new MarkDown();
        assertArrayEquals(new String[]{"blablab,*b"},markDown.format( "blablab *b"));

    }

    @Test
    public void printArrstartChangeFormatbold(){
        MarkDown markDown=new MarkDown();
        assertArrayEquals(new String[]{"<b>,blabla,bla"},markDown.format( "*blabla bla"));

    }

    @Test
    public void printArrEndChangeFormatbold(){
        MarkDown markDown=new MarkDown();
        assertArrayEquals(new String[]{"blabla,bla,</b>"},markDown.format( "blabla bla*"));

    }

    @Test
    public void printArr_Null(){
        MarkDown markDown=new MarkDown();
        assertArrayEquals(null,markDown.format( null));

    }




}
