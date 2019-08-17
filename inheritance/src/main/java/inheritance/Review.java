package inheritance;

public class Review {
    String body;
    String author;
    int numberStars;
    Reviewable reviewed = null;

    // constructor
    public Review(String body, String author, int numberStars) {
        this.body = body;
        this.author = author;
        this.numberStars = numberStars;

    }

    public String toString() {
        return author + " rates " +
                reviewed.getName() + " " +
                numberStars + " stars out of 5. Their review: " +
                body + ".";
    }
}