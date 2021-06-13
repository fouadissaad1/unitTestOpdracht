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

    public Ingredient(int amount, String singular, String plural, String what) {
        this.amount = amount;
        this.singular = singular;
        this.plural = plural;
        this.what = what;
    }

    public String getWhat() {
        return what;
    }

    public int getAmount() {
        return amount;
    }

    public String getSingular() {
        return singular;
    }

    public String getPlural() {
        return plural;
    }


    public String print(int  nrOfPortions) {
        String text="peper en zout naar smaak";
        if (what==null && nrOfPortions==0) return nrOfPortions+" "+this.plural;
        if (what==null && amount==1) return amount+" "+this.singular;
        if (what==null && amount >1) return amount+" "+this.plural;
        if (what != null && amount == 1) return this.amount + " " + this.singular + " " + this.what;
        if (what != null && amount > 1) return this.amount + " " + this.plural + " " + this.what;
        return text;
    }

}
