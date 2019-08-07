import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args){
    System.out.println("Hello world");

    // Pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // Flipping coins

    flipNHeads(3);
    flipNHeads(2);

    //Command Line Clock

    // Clock();

  }
  // Pluralize
  public static String pluralize(String singular, int count){
    // adapted from https://stackoverflow.com/questions/3189432/effective-way-to-handle-singular-plural-word-based-on-some-collection-size

    String plural = singular + "s";
    return count == 1 ? singular : plural;

    
  }

  // Flipping coins
  public static int flipNHeads(int n){
    int totalFlips = 0;
    int numberOfHeadsInARow = 0;
  

    while (numberOfHeadsInARow != n) {
      totalFlips ++;

      // Flip the coin
      double headsOrTails = Math.random();

      if (headsOrTails >= 0.5){
        numberOfHeadsInARow ++;
        System.out.println("heads");
      }else{
        numberOfHeadsInARow = 0;
        System.out.println("tails");
      }
    }

  String message = "It took " + pluralize("flip",totalFlips) + " to flip " + pluralize("head", n) + " in a row";

  return message;

  }

  //Command line clock 
  
  //TODO: write method to increment the time by second. Currently it shows original timestamp forever
  // public static void Clock(){
  //   int currentSecond = 0;
  //   while(true){
  //     LocalDateTime now = LocalDateTime.now();
  //     String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));

  //     if (currentSecond != second){
  //       currentSecond = second;

  //       if 
  //       System.out.println(time);

  //     }

      
  //   }
  //   return time;
  // }

  


}
