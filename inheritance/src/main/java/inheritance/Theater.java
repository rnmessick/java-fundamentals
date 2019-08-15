package inheritance;

import java.util.LinkedList;

public class Theater implements Reviewable {
    String name;
    LinkedList<String> movies = new LinkedList<>();
    LinkedList<Review> reviews = new LinkedList<>();

    public Theater(String name, LinkedList<String> movies) {
        this.name = name;
        this.movies = movies;
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public String getName() {
        return this.name;
    }

    public LinkedList<Review> getReviews() {
        return this.reviews;
    }

    public void addReview(Review review){
        if(review.reviewed == null) {
            review.reviewed = this;
            reviews.add(review);
        }
    }

    public int updateStars() {
        int stars = 5;

        if (reviews.size() > 0) {
            for (int i = 0; i < reviews.size(); i++) {
                stars += reviews.get(i).numberStars;
            }
            stars = stars/reviews.size();
        }
        return stars;
    }
    public String toString() {
        return name + " Theater is currently showing: " +
                movies + ". Users rate this location " +
                updateStars() + " stars out of 5.";
    }
}
