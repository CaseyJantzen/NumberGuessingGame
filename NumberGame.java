
import java.util.Scanner;
import java.lang.Math;

public class NumberGame {
  public static void main(String[] args) {
    int randomNumber = (int)Math.floor(Math.random() * 100);
    Scanner scan = new Scanner(System.in);
    int Guess = -1;
    boolean didTheyWin = false;

    System.out.println("How many guesses do you want?");
    int tries = scan.nextInt();

    for(int g=0; g<tries; g++) {
      System.out.println("Guess a number between 0 and 100.");
      Guess = scan.nextInt();
  
      if(Guess > randomNumber) {
        System.out.println("The guess is too high.");
      }
      else if(Guess < randomNumber) {
        System.out.println("The guess is too low.");
      }
      else {
        System.out.println("The number is " + randomNumber + ".");
        didTheyWin = true;
        System.out.println("You are Winner!");
      }
    }
    if(didTheyWin == false) {
      System.out.println("You Lost.");
      System.out.println("The number was " + randomNumber + ".");
    }
  }
}