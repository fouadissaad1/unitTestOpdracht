import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    @Test

    public void printRecipe(){
        Recipe recipe = new Recipe("appeltaart");
        assertEquals("appeltaart voor 10 personen", recipe.print(10));

    }

    @Test
    public  void printRecipeIngredient() {
        Ingredient ingredient = new Ingredient(10, "kopje", "kopjes", "bloem");
        Recipe recipe = new Recipe("appeltaart", ingredient);
        assertEquals("appeltaart voor 10 personen \n" +
                "10 kopjes bloem", recipe.print(10));
    }

    @Test
    public void printOnePersone(){
        Ingredient ingredient=new Ingredient(1,"kopje","kopjes","bloem");
        Recipe recipe =new Recipe("appeltaart",ingredient);
        assertEquals("appeltaart voor 1 persoon \n" +
                     "1 kopje bloem", recipe.print(1));
    }

    @Test
    public void printAddTwooNewIngredients(){
        Ingredient ingredient0 = new Ingredient(1, "kopje", "kopjes", "bloem");
        Ingredient ingredient1 = new Ingredient(2, "eetlepel", "eetlepels", "suiker");
        Recipe recipe = new Recipe("appeltaart");
        recipe.addIngredient(ingredient0);
        recipe.addIngredient(ingredient1);
        assertEquals("appeltaart voor 10 personen \n" +
                 "10 kopjes bloem \n" +
                  "20 eetlepels suiker",recipe.print(10));
    }



}
