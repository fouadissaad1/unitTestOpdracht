import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {
    @Test
    public void print(){
        Ingredient ingredient =new Ingredient("peper");
        assertEquals("peper",ingredient.print());
    }
}
