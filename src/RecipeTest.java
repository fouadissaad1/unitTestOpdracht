import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    @Test
    public void tileReceptReturn(){
        Recipe recipe=new Recipe("appeltaart", 1);
        assertEquals("appeltaart",recipe.print());
    }

    @Test
    public  void titleReceptReturnNull(){
        Recipe recipe=new Recipe(null, 1);
        assertEquals(null,recipe.print());
    }

    @Test
    public void addParameterHoveelOnePersoon(){
        Recipe recipe=new Recipe("appeltart 1",1);
        assertEquals("appeltart 1" ,recipe.print());
    }
}
