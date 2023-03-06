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
        // IF John = Hello John!
        // IF Zina = You are not welcome!
        // All others = Text

        String name = "John";
                if(name.equals("John")) {
                    System.out.println("Hello John!");
                } else if(name.equals("john")) {
                    System.out.println("Hi John");
                } else if(name.equals("Zina")) {
                    System.out.println("You are not welcome!");
                } else {
                    System.out.println("Very interesting name");
                }

         //switch case
        // ||=OR
        // && AND
        // switch to if -> Mac Option+Enter , PC Alt+Enter

        int currentMonth = 12;
        if (currentMonth == 12 || currentMonth == 1 || currentMonth == 2) {
            System.out.println("This is winter month");
        } else if (currentMonth == 3 || currentMonth == 4 || currentMonth == 5) {
            System.out.println("This is spring month");
        } else if (currentMonth == 6 || currentMonth == 7 || currentMonth == 8) {
            System.out.println("This is summer month");
        } else if (currentMonth == 9 || currentMonth == 10 || currentMonth == 11) {
            System.out.println("This is autumn month");
        } else {
            throw new IllegalStateException("Unexpected value: " + currentMonth);
        }

        // if student 1 = john and student 2 max
        // Print: they will work together

        String student1 = "John";
        String student2 = "Max";
        if (student1.equals("John") && student2.equals("Max")) {
            System.out.println("John and Max will work together");
        } else if (student1.equals("john") && student2.equals("max")) {
            System.out.println("John and Max will work together");
        } else {
            System.out.println("John and Max will work separately");
        }
        //new comments for branch
    }
}
