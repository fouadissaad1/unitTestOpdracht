import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private final String dishName;
    private Ingredient ingredient;
    private final List<Ingredient> ingredients = new ArrayList<>();

    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public Recipe(String dishName, Ingredient ingredient) {
        this.dishName = dishName;
        this.ingredient = ingredient;
    }

    public String print(int amountOfPortions) {

        String text = "";

        for (Ingredient ingredient : ingredients) {
            int amount = amountOfPortions + ingredient.getAmount();
            text += " \n" + amount + " " + (amount == 1 ? ingredient.getSingular() + " " + ingredient.getWhat() :
                    ingredient.getPlural() + " " + ingredient.getWhat());

        }
        if (ingredient != null && ingredient.getAmount() > 1) return dishName
                + " voor " + amountOfPortions + " personen \n" +
                (ingredient.getAmount()) + " " + ingredient.getPlural() + " " + ingredient.getWhat();

        if (ingredient != null && amountOfPortions == 1 && ingredient.getAmount() == 1) return dishName
                + " voor " + amountOfPortions + " persoon \n" +
                (ingredient.getAmount()) + " " + ingredient.getSingular() + " " + ingredient.getWhat();


        return dishName + " voor " +
                (amountOfPortions == 1 ? amountOfPortions + " persoon" : amountOfPortions + " personen")
                + text;
    }

    public void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
}
