public class Recipe {
    String dishName;
    private int aantalPersoon;


    public Recipe(String dishName, int aantalPersoon) {
        this.dishName = dishName;
        this.aantalPersoon = aantalPersoon;
    }

    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public void addIngredient(Ingredient ingredient) {


    }


    public String print(int amountOfPortions) {
        if (amountOfPortions==0) return null;
        if (amountOfPortions==1) return this.dishName;
        if (amountOfPortions>1) return this.dishName+" voor "+this.aantalPersoon+" personnen";
        return dishName;
    }
}


