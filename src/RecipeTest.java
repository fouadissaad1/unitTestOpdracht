import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecipeTest {
    @Test
    public void tileReceptReturn(){
        Recipe recipe=new Recipe("appeltaart");
        assertEquals("appeltaart",recipe.print());
    }
}
