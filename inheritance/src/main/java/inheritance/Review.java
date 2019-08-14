package inheritance;

import java.util.ArrayList;

public class Review {
    String body;
    String author;
    int numberStars;
    Restaurant restaurant;
    ArrayList<Review> reviews = new ArrayList<>();
    // constructor
    public Review(String body, String author, int numberStars) {
        this.body = body;
        this.author = author;
        this.numberStars = numberStars;

    }

    // for restaurant reviews
    public Review(String body, String author, int numberStars, Restaurant restaurant) {
        this(body, author, numberStars);
        restaurant.addReview(this);
    }

    public ArrayList<Review> getReviews() { return this.reviews;}

    public void getRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return  body + " Review by " +
                author + ", " +
                numberStars + " stars out of 5.";

//        Restaurant: The Alchemist's Alembic. The This place is the best for drinking elven wine. Review by Juniper Meadows, 5 stars out of 5.
    }


}
