package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class TheaterTest {
    Theater testTheater;
    @Before
    public void testTheater_constructor() {
        testTheater = new Theater("CineStar", new LinkedList<String>());
    }

    @Test
    public void testTheater_toString() {
        assertEquals("String should match Restaurant test", "CineStar Theater is currently showing: []. Users rate this location 5 stars out of 5.", testTheater.toString());
    }

    @Test
    public void testTheater_addMovie() {
        testTheater.addMovie("Detective Pikachu");
        testTheater.addMovie("Deadpool");
        assertEquals("Theater info should now have Detective Pikachu listed.", "CineStar Theater is currently showing: [Detective Pikachu, Deadpool]. Users rate this location 5 stars out of 5.", testTheater.toString());

    }

    @Test
    public void testTheater_removeMovie() {
        testTheater.addMovie("Detective Pikachu");
        testTheater.addMovie("Deadpool");
//        System.out.println(testTheater);
        testTheater.removeMovie("Detective Pikachu");
        assertEquals("Theater info should now have only Deadpool listed.", "CineStar Theater is currently showing: [Deadpool]. Users rate this location 5 stars out of 5.", testTheater.toString());
    }

}
