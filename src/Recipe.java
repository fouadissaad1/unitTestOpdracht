public class Recipe {
    private String dishName;
    private Ingredient ingredient;

    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public Recipe(String dishName, Ingredient ingredient) {
        this.dishName = dishName;
        this.ingredient = ingredient;
    }

    public String print(int amountOfPortions) {
        return dishName+ " voor "+amountOfPortions+" personen";
    }
}
