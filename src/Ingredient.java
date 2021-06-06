public class Ingredient {
    private String what;
    private int amount;
    private String singular;
    private String plural;

    public Ingredient(String what) {
        this.what = what;
    }

    public Ingredient(int amount, String singular, String plural) {
        this.amount = amount;
        this.singular = singular;
        this.plural = plural;
    }

    public String print(int  nrOfPortions) {
        String text="peper en zout naar smaak";

        if (what==null && amount==1) return nrOfPortions+" "+this.singular;

        return text;
    }
}
