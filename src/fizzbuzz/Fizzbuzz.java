
package fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author Paul Scarrone
 */
public class Fizzbuzz {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

	// @ninjapanzer
	System.out.println("Pick a number.");
	int number = keyboard.nextInt();
	String response = "";

	if(number % 3 == 0 && number % 5 == 0){
	  response = "FizzBuzz";
	}else if(number % 3 == 0){
	  response = "Fizz";
	}else if(number % 5 == 0){
	  response = "Buzz";
	}
	System.out.println(response);

	// @garyanewsome
	System.out.println("Please enter a integer between 1 and 100.");
	int intNumber = keyboard.nextInt();

	if (intNumber % 3 == 0 && intNumber % 5 == 0){
	  System.out.println("FizzBuzz!!!!");
	}else if (intNumber %3 == 0){
	  System.out.println("Fizz!");
	}else if (intNumber % 5 == 0){
	  System.out.println("Buzz!");
	}else{
	  System.out.println("ZZUbZZIf?!?!");
	}

	// @srtinkey
	System.out.println("Let's play FizzBuzz!\n");
	System.out.println("Enter a number between 1 and 100: ");
	int numIn = keyboard.nextInt();

	if (numIn % 3 == 0)
	  System.out.print("FIZZ");
	if (numIn % 5 == 0)
	  System.out.print("BUZZ\n");
	System.out.println("");
  }
  
}
