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
    public void printMeervoidMet4Parameter1NrOfPortion(){
        Ingredient ingredient =new Ingredient(1,"eetlepel","eetelps","suiker");
        assertEquals("1,eetlepel,suiker",ingredient.print(1));
   }


    @Test
    public void printMeervoidMet4ParameterMorethat4NrOfPortion(){
        Ingredient ingredient =new Ingredient(4,"eetlepel","eetelps","suiker");
        assertEquals("4,eetelps,suiker",ingredient.print(4));
    }

    @Test
    public void printNrOfPortion5And2Amout(){
        Ingredient ingredient =new Ingredient(2,"kopje","kopjes","bloem");
        assertEquals("5,kopjes,bloem",ingredient.print(5));
    }


}
