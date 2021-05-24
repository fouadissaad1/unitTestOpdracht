public class Ingredient {
    String what;
    int amount;
    String singular;
    String plural;

    public Ingredient(String what) {
        this.what = what;
    }

    public Ingredient(int amount, String singular, String plural) {
       this.amount=amount;
       this.singular=singular;
       this.plural=plural;


    }

    public String print() {

        if (what==null) return this.amount+","+this.singular+","+this.plural;

      return this.what;
    }
}
