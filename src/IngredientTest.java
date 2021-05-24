import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {
    @Test
    public void print(){
        Ingredient ingredient =new Ingredient("peper en zout naar smaak");
        assertEquals("peper en zout naar smaak",ingredient.print());
    }

    @Test
    public  void printNll(){
        Ingredient ingredient =new Ingredient(null);
        assertEquals(null,ingredient.print());
    }
}
