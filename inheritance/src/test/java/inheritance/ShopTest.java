package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop testShop;
    @Before
    public void testShop_constructor() {
        testShop = new Shop("Cloak and Dagger", "A wondrous shop for all your adventuring needs!", 4);
    }
    @Test
    public void testShop_toString() {
        assertEquals("Shop description should be a string", "Shop name: Cloak and Dagger, Description: A wondrous shop for all your adventuring needs! How many $ signs? 4", testShop.toString());
    }
}
