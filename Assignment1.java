import java.util.Scanner;

import java.util.Random;


public class Assignment1 {
  public static void main(String[] args) {
    System.out.println("KK      KK       DDDDDDDDD");
    System.out.println("KK    KK         DD      DD");
    System.out.println("KK  KK           DD      DD");
    System.out.println("KK KK            DD      DD");
    System.out.println("KKKK             DD      DD");
    System.out.println("KK KK            DD      DD");
    System.out.println("KK  KK           DD      DD");
    System.out.println("KK    KK         DD      DD");
    System.out.println("KK      KK       DDDDDDDDD");
    System.out.println(" ");

    final int BASE = 32;
    final double CONVERSION_FACTOR = 5.0 / 9.0;

    int fahrenheitTemp;
    double celsiusTemp;

    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter a number in Fahrenheit: ");
    fahrenheitTemp = scan.nextInt();

    celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;

    String userInput;
    String removeLetters;
    String reverseLetters;

    scan.nextLine();

    System.out.println("Please enter a 5-character string: ");
    userInput = scan.nextLine();
    removeLetters = userInput.substring(1, 4);
    reverseLetters = new StringBuilder(removeLetters).reverse().toString();


    scan.close();

    Random generator = new Random();
    int num1;

    num1 = generator.nextInt(16353) + 32;
    System.out.println("Random number generated. Continuing...");

    System.out.println("Your new string is " + celsiusTemp + reverseLetters + num1);
  }
}
