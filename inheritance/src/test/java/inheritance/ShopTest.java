package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop testShop;
    Review testReview;

    @Before
    public void testShop_constructor() {
        testShop = new Shop("Cloak and Dagger", "A wondrous shop for all your adventuring needs!", 4);
        testReview = new Review("Beautiful cloaks but overpriced", "Larissa Vicelord", 3);
    }

    @Test
    public void testShop_toString() {
        assertEquals("Shop description should be a string", "Shop name: Cloak and Dagger, Description: A wondrous shop for all your adventuring needs! How many $ signs? 4", testShop.toString());
    }

    @Test
    public void testShop_addReview() {
        testShop.addReview(testReview);
        assertEquals("New review should be added to the shop", "Larissa Vicelord rates Cloak and Dagger 3 stars out of 5. Their review: Beautiful cloaks but overpriced.", testReview.toString());
    }
}
