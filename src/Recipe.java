public class Recipe {
    String dishName;
    private int aantalPersoon;


    public Recipe(String dishName, int aantalPersoon) {
        this.dishName = dishName;
        this.aantalPersoon = aantalPersoon;
    }

    public void addIngredient(Ingredient ingredient) {

    }


    public String print() {
        return dishName;
    }
}


