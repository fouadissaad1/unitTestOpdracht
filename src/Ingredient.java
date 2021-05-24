public class Ingredient {
    String what;
    public Ingredient(String what) {
        this.what=what;
    }

    public String print() {
        if (what==null) return null;
        return what;
    }
}
