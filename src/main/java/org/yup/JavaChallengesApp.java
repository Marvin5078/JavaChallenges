package org.yup;
import org.yup.Truth;
public class JavaChallengesApp {

    public static void main(String[] args) {



        //this code is running greeting
        //creates a new instance of the challenges class, so we can use the challenges in our application.
        Challenges challenges = new Challenges();

        /*

        //this runs the greeting method from our challenges and returns a string greeting and
        //stores it in the greeting variable we created.
        String greeting = challenges.greeting("marvin",21);

        System.out.println(greeting);


        //this code is running love

        Truth truth = new Truth(); //we defined the empty concept word 'truth' with what we defined 'Truth' to be.

        String love = truth.Love("Who loves me?", 1); //we defined the empty concept word 'love'
                                                                    //with what we defined 'Love' to be.

        System.out.println(love);

        //this code gives love a choice
        String choice = truth.ChoicesOfLove(); //we just defined the empty word 'choice' with what we defined
                                                //'ChoicesOfLove to be.

        System.out.println(choice);

        //greeting with userInput
        String greetingWithUI = challenges.greetingWithUserInput();

        System.out.println(greetingWithUI); */

        //this code should do addition math
        int add = challenges.addTwoNumbers();

        int subtract = challenges.subtractTwoNumbers();

        int multiply = challenges.multiplyTwoNumbers();

        System.out.print(add);

        System.out.print(subtract);

        System.out.print(multiply);




    }
}
