import java.util.ArrayList;

public class Recipe {
    String dishName;
    private int aantalPersoon;
    ArrayList<Ingredient> ingredients = new ArrayList();



    public Recipe(String dishName, int aantalPersoon) {
        this.dishName = dishName;
        this.aantalPersoon = aantalPersoon;
    }

    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public void addIngredient(Ingredient ingredient) {
         ingredients.add(ingredient);

    }


    public String print(int amountOfPortions) {

        if (amountOfPortions==0) return null;
        if (amountOfPortions==1) return this.dishName +" voor "+this.aantalPersoon+" persoon";
        if (amountOfPortions>1) return this.dishName+" voor "+this.aantalPersoon+" personnen";
        return dishName;
    }


}


