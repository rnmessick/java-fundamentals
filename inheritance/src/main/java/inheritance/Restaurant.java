package inheritance;

import java.util.ArrayList;

public class Restaurant {
    static String name;
    int numberStars;
    int priceCategory;

    ArrayList<Review> reviews = new ArrayList<>();

    // Restaurant constructor
    public Restaurant(String name, int numberStars, int priceCategory) {
        this.name = name;
        this.numberStars = numberStars;
        this.priceCategory = priceCategory;
    }

    @Override
    public String toString() {
        return "Restaurant Name: " + name + ", " +
                numberStars + " Stars of 5 and " +
                priceCategory + "$(of $$$$$)";
    }

    public void addReview(Review review) {
        this.reviews.add(review);
        review.getRestaurant(this);

    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }


}



