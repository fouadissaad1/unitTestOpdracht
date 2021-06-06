public class Recipe {
    private String dishName;

    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public String print(int amountOfPortions) {
        return dishName+ " voor "+amountOfPortions+" personen";
    }
}
