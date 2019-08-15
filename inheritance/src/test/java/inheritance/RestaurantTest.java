package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    Restaurant testRestaurant;
    @Before
    public void testRestaurant_constructor() {
        testRestaurant = new Restaurant("The Alchemist's Alembic", 5, 3);
    }

    @Test
    public void testRestaurant_toString() {
        assertEquals("String should match Restaurant test", "Restaurant Name: The Alchemist's Alembic, 5 Stars of 5 and 3$(of $$$$$)", testRestaurant.toString());
    }

}
