import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String dishName;
    private Ingredient ingredient;
    private List<Ingredient> ingredients=new ArrayList<>();

    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public Recipe(String dishName, Ingredient ingredient) {
        this.dishName = dishName;
        this.ingredient = ingredient;
    }

    public String print(int amountOfPortions) {

        String text="";

        for (Ingredient  ingredient:ingredients) {
            text+=dishName+"\n"+ingredient.getPlural()+ingredient.getWhat();
        }
        return dishName+ " voor "+amountOfPortions+" personen";
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }
}
