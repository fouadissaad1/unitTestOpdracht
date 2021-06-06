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

    public String print(int  nrOfPortions) {
        String text="peper en zout naar smaak";

        if (what==null && nrOfPortions==1) return nrOfPortions+" "+this.singular;
        if (what==null && nrOfPortions==0) return nrOfPortions+" "+this.plural;
        if (what==null && nrOfPortions >1) return nrOfPortions+" "+this.plural;
        if ((nrOfPortions==1)&&(this.singular==null)&&(this.plural==null)) return text;
        if (nrOfPortions==1&&this.what!=null) return nrOfPortions+" "+this.singular+" "+this.what;
        if (nrOfPortions>1&&this.what!=null) return nrOfPortions+" "+this.plural+" "+this.what;


        return text;
    }
}
