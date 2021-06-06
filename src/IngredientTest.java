import org.junit.jupiter.api.Test;

public class IngredientTest {
    @Test
    public void oneParameterWhat(){
        Ingredient ingredient=new Ingredient("perper en zout naar smaak");
        assertEquals("peper en zout naar smaak",ingredient.print(1));
    }
}
