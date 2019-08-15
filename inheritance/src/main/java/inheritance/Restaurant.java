package inheritance;

import java.util.LinkedList;

public class Restaurant implements Reviewable {
    String name;
    int numberStars;
    int priceCategory;

    LinkedList<Review> reviews = new LinkedList<>();

    // Restaurant constructor
    public Restaurant(String name, int numberStars, int priceCategory) {
        this.name = name;
        this.numberStars = numberStars;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return this.name;
    }

    public LinkedList<Review> getReviews() {
        return this.reviews;
    }

    public void addReview(Review review) {
        if (review.reviewed == null && review.getClass() != MovieReview.class) {
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
        return "Restaurant Name: " + name + ", " +
                numberStars + " Stars of 5 and " +
                priceCategory + "$(of $$$$$)";
    }

}

