import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {
    @Test
    public void oneParameterWhat(){
        Ingredient ingredient=new Ingredient("perper en zout naar smaak");
        assertEquals("peper en zout naar smaak",ingredient.print(1));
    }

    @Test
    public void oneParameterWithPrint0What(){
        Ingredient ingredient=new Ingredient("perper en zout naar smaak");
        assertEquals("peper en zout naar smaak",ingredient.print(0));
    }
}
