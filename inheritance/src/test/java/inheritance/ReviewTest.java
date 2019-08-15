package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class ReviewTest {
    Review testReview;

    @Before
    public void testReview_constructor() {
        testReview = new Review("This place is the best for drinking elven wine", "Juniper Meadows", 5);
        testReview.reviewed = new Restaurant("The Alchemist's Alembic", 4, 3);
    }

    @Test
    public void testReview_toString() {
        assertEquals("String should match Review test", "Juniper Meadows rates The Alchemist's Alembic 5 stars out of 5. Their review: This place is the best for drinking elven wine.", testReview.toString());
    }

}


