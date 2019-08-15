package inheritance;

import java.util.ArrayList;

public class Shop {
    String name;
    String description;
    int dollarSigns;
    ArrayList<Review> reviews = new ArrayList<>();

    public Shop(String name, String description, int dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
    }

    @Override
    public String toString() {
        return "Shop name: " + name +
                ", Description: " + description +
                " How many $ signs? " + dollarSigns;
    }

    public ArrayList<Review> getReviews() {
        return this.reviews;
    }
}
