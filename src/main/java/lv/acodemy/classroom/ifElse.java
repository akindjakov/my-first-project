package lv.acodemy.classroom;

public class ifElse {
    public static void main(String[] args) {

        //IF
        /*
        if(condition) {
        code to be executed
        }
         */

        //   boolean x = 5 > 2;
        //   System.out.println(x);
        //   if(x) {
        //   System.out.println("Correct");
        //   }

        int number = 21;
        if (number % 2 == 0) {
            System.out.println("Number: " + number + " is even");
        } else {
            System.out.println("Number: " + number + " is NOT even number");
        }

        int age = 17;
        if (age <= 17) {
            System.out.println("NOT ALLOWED");
        } else {
            System.out.println("ALLOWED");
        }

        boolean isSummer = true;
        if (isSummer) {
            System.out.println("Summer months: June, July, August");
        }

        // IF-ELSE-IF
        /*
        if (condition) {
        code to be executed
        } else if(executed) {
        code to be executed
        } else {
        code to be executed
        }
         */
        int num1 = 10;
        int num2 = 20;
        if (num1 > 0) {
            if (num2 > 0) {
                System.out.println("Both numbers are positive");
            } else {
                System.out.println("Num1 is positive, but num2 is negative");
            }
        } else {
            System.out.println("Num1 is negative");
        }
        int age2 = 18;
        if (age2 <= 0) {
            System.out.println("Who are you?");
        } else if (age2 <= 17) {
            System.out.println("NOT ALLOWED");
        } else {
            System.out.println("Welcome to our shop!");
        }
    }
}
