import java.util.ArrayList;

public class Recipe {
    String dishName;
    private int nrOfPortions;
    ArrayList<Ingredient> ingredients = new ArrayList();



    public Recipe(String dishName, int nrOfPortions) {
        this.dishName = dishName;
        this.nrOfPortions = nrOfPortions;
    }

    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public void addIngredient(Ingredient ingredient) {
         ingredients.add(ingredient);

    }


    public String print(int amountOfPortions) {

        if (amountOfPortions==0) return null;
        if (amountOfPortions==1) return this.dishName +" voor "+this.nrOfPortions+" persoon";
        for (Ingredient  ingredient:ingredients) {
                 ingredient.print(1);
                 return ingredient.amount+","+ingredient.singular+","+ingredient.what;
        }
        if (amountOfPortions>1) return this.dishName+" voor "+this.nrOfPortions+" personnen";
        return dishName;
    }


}


