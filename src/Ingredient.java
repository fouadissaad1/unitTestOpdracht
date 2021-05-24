public class Ingredient {
    String what;
    int amount;
    String singular;
    String plural;

    public Ingredient(String what) {
        this.what = what;
    }

    public Ingredient(int amount, String singular, String plural, String what) {
        this.what = what;
        this.amount=amount;
        this.singular=singular;
        this.plural=plural;
    }

    public Ingredient(int amount, String singular, String plural) {
       this.amount=amount;
       this.singular=singular;
       this.plural=plural;


    }

    public String print() {

        if (what==null) return this.amount+","+this.singular+","+this.plural;
        if((amount==0)&&(singular==null)&&(plural==null))return this.what;
        if((amount==0)&&(singular==null)&&(plural==null)&(what==null))return 0+","+null+","+null+","+null;
        return this.amount+","+this.singular+","+this.plural+","+this.what;
    }
}
