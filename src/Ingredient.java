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

    public String print(int nrOfPortions) {
        String text=" naar smaak";

        if (nrOfPortions>1){
            return nrOfPortions+","+this.plural+","+this.what;
        }
        if ((nrOfPortions==1)&&(amount==1)){
          return nrOfPortions +","+this.singular+","+this.what;
        }
        if (nrOfPortions==0) return null;

//        if (amount>1) return this.amount+","+this.plural;
//        if ((amount==0)&&(this.singular==null)&&(this.plural==null)&&(this.what==null)) {
//            return null;
//        }
//        if (amount==0) return  this.what + text;
//        if ((amount==1)&&(this.what!=null)) return this.amount + "," + this.singular+","+this.what;
//        if (amount==1) return this.amount+","+this.singular;
//        if ((singular!=null)) return this.amount + "," + this.singular+","+this.what;
//        if (what!=null) return  this.what + text;



        ///if (what==null) return this.amount+","+this.singular+","+this.plural;
        //if((amount==0)&&(singular==null)&&(plural==null))return this.what;
        //if (amount==1) return  this.amount+","+this.singular+","+this.what;
        ///if (what==null) return this.amount+","+this.singular+","+this.plural;
        ///if((amount==0)&&(singular==null)&&(plural==null))return this.what;
        ///if((amount==0)&&(singular==null)&&(plural==null)&(what==null))return 0+","+null+","+null+","+null;


      return  this.what + text;

    }
}
