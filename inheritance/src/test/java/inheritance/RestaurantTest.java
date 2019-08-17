package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    Restaurant testRestaurant;
    Review testReview;
    @Before
    public void testRestaurant_constructor() {
        testRestaurant = new Restaurant("The Alchemist's Alembic", 5, 3);
        testReview = new Review("This place is the best for drinking elven wine", "Juniper Meadows", 5);
    }

    @Test
    public void testRestaurant_toString() {
        assertEquals("String should match Restaurant test", "Restaurant Name: The Alchemist's Alembic, 5 Stars of 5 and 3$(of $$$$$)", testRestaurant.toString());
    }

    @Test
    public void testReview_addRestaurantReview() {
        testRestaurant.addReview(testReview);
        assertEquals("String should match Review test", "Juniper Meadows rates The Alchemist's Alembic 5 stars out of 5. Their review: This place is the best for drinking elven wine.", testReview.toString());
    }

}
