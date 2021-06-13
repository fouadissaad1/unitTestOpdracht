import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    @Test
    public void printRecipe() {
        Recipe recipe = new Recipe("appeltaart");
        assertEquals("appeltaart voor 10 personen", recipe.print(10));
    }

    @Test
    public void printRecipeIngredient() {
        Ingredient ingredient = new Ingredient(10, "kopje", "kopjes", "bloem");
        Recipe recipe = new Recipe("appeltaart", ingredient);
        assertEquals("appeltaart voor 10 personen \n" +
                "10 kopjes bloem", recipe.print(10));
    }

    @Test
    public void printAmountOfPortions0() {
        Recipe recipe = new Recipe("appeltaart");
        assertEquals("appeltaart voor 0 personen", recipe.print(0));
    }

    @Test
    public void printOnePersone() {
        Ingredient ingredient = new Ingredient(1, "kopje", "kopjes", "bloem");
        Recipe recipe = new Recipe("appeltaart", ingredient);
        assertEquals("appeltaart voor 1 persoon \n" +
                "1 kopje bloem", recipe.print(1));
    }

    @Test
    public void printIngredient() {
        Ingredient ingredient = new Ingredient(20, "eetlepel", "eetlepels", "suiker");
        Recipe recipe = new Recipe("appeltaart", ingredient);
        assertEquals("appeltaart voor 10 personen \n" +
                "20 eetlepels suiker", recipe.print(10));
    }

    @Test
    public void printAddTwooNewIngredients() {
        Ingredient ingredient0 = new Ingredient(1, "kopje", "kopjes", "bloem");
        Ingredient ingredient1 = new Ingredient(2, "eetlepel", "eetlepels", "suiker");
        Recipe recipe = new Recipe("appeltaart");
        recipe.addIngredient(ingredient0);
        recipe.addIngredient(ingredient1);
        assertEquals("appeltaart voor 20 personen \n" +
                "21 kopjes bloem \n" +
                "22 eetlepels suiker", recipe.print(20));
    }

    @Test
    public void printCalculPortions1() {
        Ingredient ingredient1 = new Ingredient(1, "kopje", "kopjes", "bloem");
        Ingredient ingredient2 = new Ingredient(2, "eetlepel", "eetlepels", "suiker");
        Recipe recipe = new Recipe("appeltaart");
        recipe.addIngredient(ingredient1);
        recipe.addIngredient(ingredient2);
        String result = recipe.print(1);
        assertEquals("appeltaart voor 1 persoon \n" +
                "2 kopjes bloem \n" +
                "3 eetlepels suiker", result);

    }
}
