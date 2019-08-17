package inheritance;

import java.util.LinkedList;

public class Shop implements Reviewable {
    String name;
    String description;
    int dollarSigns;
    LinkedList<Review> reviews = new LinkedList<>();

    public Shop(String name, String description, int dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
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
            for (Review review : reviews) {
                stars += review.numberStars;
            }
            stars = stars/reviews.size();
        }
        return stars;
    }

    public String toString() {
        return "Shop name: " + name +
                ", Description: " + description +
                " How many $ signs? " + dollarSigns;
    }
}


