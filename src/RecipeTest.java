import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    @Test

    public void printRecipe(){
        Recipe recipe = new Recipe("appeltaart");
        assertEquals("appeltaart voor 10 personen", recipe.print(10));

    }

    @Test
    public  void printRecipeIngredient(){
        Ingredient ingredient=new Ingredient(10,"kopje","kopjes","bloem");
        Recipe recipe=new Recipe("appeltaart",ingredient);
        assertEquals("appeltaart voor 10 personen 10 kopjes bloem",recipe.print(10));
    }



}
