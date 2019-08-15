package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
public class MovieReviewTest {

    Theater testTheater;
    LinkedList<String> testMovie;
    MovieReview reviewTheater;
    MovieReview reviewMovie;

    LinkedList<Reviewable> reviewedThings;

    @Before
    public void testMovieReview_constructor() {
        testTheater = new Theater("CineStar", new LinkedList<String>());
        testMovie = new LinkedList<>();
        testMovie.add("Detective Pikachu");
        reviewTheater = new MovieReview("Floor was sticky, popcorn stale.", "Belatrix LeStrange", 2);
        reviewMovie = new MovieReview("Best movie ever!", "Jesse Rocket",5, "Detective Pikachu");

        reviewedThings = new LinkedList<>();
        reviewedThings.add(testTheater);
    }
    @Test
    public void testMovieReview_movieIncluded() {
        testTheater.addReview(reviewMovie);
        assertEquals("Should return review that mention the movie watched", "Jesse Rocket rates their experience at CineStar Theaters 5 stars out of 5! Film: Detective Pikachu Here's what they had to say: Best movie ever!", reviewMovie.toString() );
    }

    @Test
    public void testMovieReview_theaterOnly() {
        testTheater.addReview(reviewTheater);
        assertEquals("Should return review with n/a instead of film title. ", "Belatrix LeStrange rates their experience at CineStar Theaters 2 stars out of 5! Film: n/a Here's what they had to say: Floor was sticky, popcorn stale.", reviewTheater.toString() );
    }

}
