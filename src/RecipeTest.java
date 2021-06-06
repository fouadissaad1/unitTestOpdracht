import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    @Test

    public void printRecipe(){
        Recipe recipe = new Recipe("appeltaart");
        assertEquals("appeltaart voor 10 personen", recipe.print(10));

    }


}
