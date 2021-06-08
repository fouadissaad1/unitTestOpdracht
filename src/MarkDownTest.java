import org.junit.jupiter.api.Test;

public class MarkDownTest {

    @Test
    public void printformat(){
        MarkDown markDown= MarkDown();
        String[] arr1 = markdown.format("blabla bla");
        String[] arr2 = markdown.format("blabla bla");
        assertArrayEquals(arr1,arr2);
    }
}
