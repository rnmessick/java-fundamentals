package inheritance;

import java.util.LinkedList;

public interface Reviewable {
    void addReview(Review review);
    int updateStars();
    String getName();
    LinkedList<Review> getReviews();
}
