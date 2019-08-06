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

    Clock();

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
    int tailCount = 0;
    int headCount = 0;

    while (headCount < n) {
      if (Math.random() < .5){
        System.out.println("heads");
        headCount ++;
        totalFlips ++;

      }else{
      
        System.out.println("tails");
        totalFlips ++;

      }

    }
    System.out.println("It took " + totalFlips + " flips to flip " + n + " heads in a row");
    return totalFlips;

  }

  //Command line clock 
  
  //TODO: write method to increment the time by second. Currently it shows original timestamp forever
  public static String Clock(){
    LocalDateTime now = LocalDateTime.now();
    String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    while(time == time){

      System.out.println(time);
      
    }
    return time;
  }

  


}
