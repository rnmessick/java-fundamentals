package inheritance;

public class MovieReview extends Review{
    String movie;

    public MovieReview(String body, String author, int numStars, String movie) {
        super(body, author, numStars);
        this.movie = movie;

    }

    public MovieReview(String body, String author, int numStars) {
        super(body, author, numStars);
        this.movie = "n/a";

    }

    public String toString() {
        return author + " rates their experience at " +
                reviewed.getName() + " Theaters " +
                numberStars + " stars out of 5! " + "Film: " +
                movie + " Here's what they had to say: " +
                body;
    }

}
