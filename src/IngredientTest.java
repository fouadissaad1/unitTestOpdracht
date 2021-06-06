import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {
    @Test
    public void oneParameterWhat(){
        Ingredient ingredient=new Ingredient("perper en zout naar smaak");
        assertEquals("peper en zout naar smaak",ingredient.print(1));
    }

    @Test
    public void oneParameterWithPrint0What(){
        Ingredient ingredient=new Ingredient("perper en zout naar smaak");
        assertEquals("peper en zout naar smaak",ingredient.print(0));
    }

    @Test
    public  void threeParamenterSingle(){
        Ingredient ingredient=new Ingredient(1,"appel","appels");
        assertEquals("1 appel",ingredient.print(1));
    }

    @Test
    public  void threeParamenterNrOfPortions0Single(){
        Ingredient ingredient=new Ingredient(1,"appel","appels");
        assertEquals("0 appels",ingredient.print(0));
    }

    @Test
    public  void threeParamenterPlural(){
        Ingredient ingredient=new Ingredient(1,"knoflookteen","knoflooktenen");
        assertEquals("4 knoflooktenen",ingredient.print(4));
    }

    @Test
    public  void whatSingle(){
        Ingredient ingredient=new Ingredient(1,"eetlepel","eetlepels","suiker");
        assertEquals("1 eetlepel suiker",ingredient.print(1));
    }

    @Test
    public  void whatPlural(){
        Ingredient ingredient=new Ingredient(1,"eetlepel","eetlepels","suiker");
        assertEquals("2 eetlepels suiker",ingredient.print(2));
    }
}
