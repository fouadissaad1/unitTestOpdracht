import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {
    @Test
    public void printWhat(){
        Ingredient ingredient =new Ingredient("peper en zout");
        assertEquals("peper en zout naar smaak",ingredient.print(1));
    }

    @Test
    public  void PrintWhatNullAnNrOfPortionNull(){
        Ingredient ingredient =new Ingredient(null);
        assertEquals(null,ingredient.print(0));
    }

    @Test
    public void printThreParamenter(){
        Ingredient ingredient =new Ingredient(1,"appel","appels");
        assertEquals("1,appel",ingredient.print(1));
    }
    @Test
    public void printOneAmoutvoidMet3Parameter(){
        Ingredient ingredient =new Ingredient(1,"appel","appels");
        assertEquals("1,appel",ingredient.print(1));
    }

    @Test
    public void printMeervoidMet3ParameterMoreDen2NrOfPortion(){
        Ingredient ingredient =new Ingredient(2,"knoflookteen","knoflooktenen");
        assertEquals("2,knoflooktenen",ingredient.print(2));
    }

    @Test
    public void printMeervoidMet3Parameter1NrOfPortion(){
        Ingredient ingredient =new Ingredient(1,"eetlepel","eetelps","suiker");
        assertEquals("1,eetlepel,suiker",ingredient.print(1));
   }
//
//    @Test
//    public void print4Paramenter_Null(){
//        Ingredient ingredient =new Ingredient(0,null,null,null);
//        assertEquals(null,ingredient.print(0));
//    }






}
