import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        // Pluralize
        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        // Flipping coins
        System.out.println(flipNHeads(3));

        //Command Line Clock

        Clock();

    }

    // Pluralize
    public static String pluralize(String singular, int count) {
        // adapted from https://stackoverflow.com/questions/3189432/effective-way-to-handle-singular-plural-word-based-on-some-collection-size

        String plural = singular + "s";
        return count == 1 ? singular : plural;

    }

    // Flipping coins
    public static String flipNHeads(int n) {
        int totalFlips = 0;
        int numberOfHeadsInARow = 0;

        while (numberOfHeadsInARow != n) {
            totalFlips++;

            // Flip the coin
            double headsOrTails = Math.random();

            if (headsOrTails >= 0.5) {
                numberOfHeadsInARow++;
                System.out.println("heads");
                if (numberOfHeadsInARow == n) {
                    String message = "It took " + totalFlips + pluralize(" flip", totalFlips) + " to flip " + n + " " + pluralize("head", n) + " in a row";
                    return message;
                }
            } else {
                numberOfHeadsInARow = 0;
                System.out.println("tails");
            }
        }
        return "Please select an integer greater than 0.";

    }

    //Command line clock

    public static void Clock() {
        int currentSecond = 0;

        while (true) {
            LocalDateTime now = LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            if (currentSecond != second) {
                currentSecond = second;

                System.out.println(padNum(hour) + ":" + padNum(minute) + ":" + padNum(second));

            }
        }

    }

    public static String padNum(int n) {
        if (n < 10) {
            return "0" + n;
        } else {
            return "" + n;
        }
    }
}

 