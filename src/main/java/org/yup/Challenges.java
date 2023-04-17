package org.yup;

import java.util.Scanner;

public class Challenges {

    public String greetingWithUserInput() {

        Scanner scanner = new Scanner(System.in);

        //we need to ask the user what their name is?
        System.out.print("What is your name: ");
        String name = scanner.nextLine();


        //we need to ask the user what their age is?
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        //control flow logic (is an if statement sort of like protocols)
        if (age >= 21) {
            return "No problem " + name + " you can get in";
        } else {
            return "Sorry " + name + " but no babies allowed.";
        }

    }

    public String greeting(String name, int age) {

        //control flow logic (is an if statement sort of like protocols)
        if (age >= 21) {
            return "No problem " + name + " you can get in";
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
}
