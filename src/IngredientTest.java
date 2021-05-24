import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {
    @Test
    public void print(){
        Ingredient ingredient =new Ingredient("peper en zout naar smaak");
        assertEquals("peper en zout naar smaak",ingredient.print());
    }
    @Test
    public void printThreParamenter(){
        Ingredient ingredient =new Ingredient(1,"appel","appels");
        assertEquals("1,appel,appels",ingredient.print());
    }

    @Test
    public void print4Paramenter(){
        Ingredient ingredient =new Ingredient(1,"eetlepel","eetelps","suiker");
        assertEquals("1,eetlepel,eetelps,suiker",ingredient.print());
    }

    @Test
    public void print4Paramenter_Null(){
        Ingredient ingredient =new Ingredient(0,null,null,null);
        assertEquals("0,null,null",ingredient.print());
    }


}
