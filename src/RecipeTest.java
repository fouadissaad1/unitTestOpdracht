import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    @Test
    public void tileReceptReturn(){
        Recipe recipe=new Recipe("appeltaart");
        assertEquals("appeltaart",recipe.print(1));
    }

    @Test
    public  void amountOfPortionsNullIs(){
        Recipe recipe=new Recipe(null);
        assertEquals(null,recipe.print(0));
    }

    @Test
    public void addAantalPersoon(){
        Recipe recipe=new Recipe("appeltart",10);
        assertEquals("appeltart voor 10 personnen",recipe.print(10));
    }


}
