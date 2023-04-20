package org.yup;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenges {

    public String greetingWithUserInput() {

        Scanner scanner = new Scanner(System.in);

        //we need to ask the user what their name is?
        System.out.print("What do you wish to find? ");
        String name = scanner.nextLine();


        //we need to ask the user what their age is?
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        //control flow logic (is an if statement sort of like protocols)
        if (age >= 21) {
            return name + " is yours";
        } else {
            return name + " is ahead of you";
        }

    }

    public String greeting(String name, int age) {

        //control flow logic (is an if statement sort of like protocols)
        if (age >= 21) {
            return "Why would you like to get in, " + name + "?";
        } else {
            return "Sorry " + name + " but no babies allowed.";
        }

    }

    public int addTwoNumbers() {

        Scanner scan = new Scanner(System.in);


        //ask the user for number
        System.out.print("Enter first number to add: ");
        int number = scan.nextInt();

        //ask the user for number2
        System.out.print("Enter second number to add: ");
        int number2 = scan.nextInt();


        //return the sum of number1 and number 2 together.
        return number + number2;
    }


    public int subtractTwoNumbers() {
        // create a method that subtracts 2 numbers and multiply 2 numbers
        Scanner scan = new Scanner(System.in);


        //ask the user for number
        System.out.print("Enter first number to subtract: ");
        int number = scan.nextInt();


        //ask the user for number2
        System.out.print("Enter second number to subtract: ");
        int number2 = scan.nextInt();
        return number - number2;

    }


    public int multiplyTwoNumbers() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number to multiply: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number to multiply: ");
        int number2 = scan.nextInt();

        return number1 * number2;
    }

    public int divideTwoNumbers() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first number to divide: ");
        int number1 = scan.nextInt();

        System.out.print("Enter second number to divide: ");
        int number2 = scan.nextInt();

        return number1 / number2;
    }

    public int joshuaTree() {

        // fire up scanner so we can use it
        Scanner scan = new Scanner(System.in);

        //displays some set of choices for the user
        System.out.println("Welcome to the calculator!");
        System.out.println("Press 1 to add numbers");
        System.out.println("Press 2 to subtract numbers");
        System.out.println("Press 3 to multiply numbers");
        System.out.println("Press 4 to divide numbers");
        System.out.print("Enter your selection and press ENTER: ");

        //this sits and waits for the user to give (1,2,3). when they hit ENTER
        //their selection is stored in UserSelection
        int userSelection = scan.nextInt();

        int result = 0;

        switch (userSelection) {
            case 1:
                result = this.addTwoNumbers();
                break;
            case 2:
                result = this.subtractTwoNumbers();
                break;
            case 3:
                result = this.multiplyTwoNumbers();
                break;
            default:
                System.out.println("User chose nonsense");

        }
        return result;
    } //interactiveCalculator

    public String coinFlip() {

        //attempt to flip a coin
        // return heads or tails

        //this is where we flip the coin
        if (Math.random() > .5) {
            //here is where we return heads if the number generated was > .5
            return "heads";
        } else {
            //here is where we return if the number generated was less than .5
            return "tails";
        }
    }

    public String findTheBiggest() {

        //fire up the scanner!
        Scanner scan = new Scanner(System.in);

        //ask the user for input then created an int type to store that number
        System.out.print("give me the first number please: ");
        int number1 = scan.nextInt();

        //ask the user for input then created an int type to store that number
        System.out.print("give me the second number please: ");
        int number2 = scan.nextInt();

        int theBigOne = Math.max(number1, number2);

        return "The biggest number between " + number1 + " and " + number2 + " is: " + theBigOne;

    }

    public String findTheSmallest() {

        Scanner scan = new Scanner(System.in);

        System.out.println("give ya boi the first number");
        int firstNumber = scan.nextInt();

        System.out.println("give ya boi the second number");
        int secondNumber = scan.nextInt();

        int theSmallOne = Math.min(firstNumber, secondNumber);

        return "The smallest number between " + firstNumber + " and " + secondNumber + " is: " + theSmallOne;
    }

    public String findTheDifference() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 1st number: ");
        int firstNumber = scan.nextInt();

        System.out.println("Enter the 2nd number: ");
        int secondNumber = scan.nextInt();

        int difference = firstNumber - secondNumber;

        int theAnswer = Math.abs(difference);

        return "The absolute difference between" + firstNumber + " and " + secondNumber + " is: " + theAnswer;

        /* Another way to do it

    int result

    if (firstNumber > secondNumber) {
    result = firstNumber - secondNumber
      }else {
    result = secondNumber - firstNumber
    }
     */
    }

    public String changeToUppercase() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word you want uppercased");
        String word = scan.nextLine();

        return "You provided, " + word + " and we converted to: " + word.toUpperCase();
    }

    public String changeToLowercase() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word you would like to have lowercased: ");
        String word = scan.nextLine();

        return "You provided " + word + " and we converted it to " + word.toLowerCase();
    }

    public String lengthOfWord() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word you wish to find the length of: ");
        String word = scan.nextLine();

        return "The word " + word + " is " + word.length() + " letters long.";
    }

    public String play2k() {

        if (Math.random() > .5) {
            return "play 2k";
        } else {
            return "go to bed";
        }

    }

    public void countToTen() {

        //int i is our thing; i <= 10 is our condition.
        for (int i = 1; i <= 100; i++) {
            //runsome code
            System.out.println(i);
        }
    }

    public void countBackwards() {

        //int i is our thing;
        for (int i = 10; i >= 1; i--) {

            System.out.println(i);
        }
    }

    public void zeroToAHunnid() {

        for (int i = 0; i <= 100; i += 2) {

            System.out.println(i);
        }
    }

    public void zeroToFiftyOdd() {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 != 2) {
                i++;
            }

            System.out.println(i);
        }
    }

    public void zeroToFiftyEven() {

        for (int i = 0; i <= 50; i++) {
            while (i % 2 == 1) {
                i++;
            }

            System.out.println(i);
        }
    }

    public void countToTenWhile() {

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
    }

    public static int summation(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;

        }
        return sum;
    }
}
