package lv.acodemy.classroom;

public class VariablesDataTypes {
    public static void main(String[] args) {

        // byte data type
        byte myCurrentAge = 31;
        System.out.println(myCurrentAge);

        // short data type
        short salaryPerMonth = 1000;
        System.out.println(salaryPerMonth);

        // char data type
        char firstNameLetter = 'N'; // also can use number from JAVA ASCII table
        System.out.println(firstNameLetter);

        // int data type
        int dateOfBirth = 110192;
        System.out.println(dateOfBirth);

        // long data type
        long populationOfLatvia = 1890254;
        System.out.println(populationOfLatvia);

        // float data type
        float lapTime = 32.30f;
        System.out.println(lapTime);

        // double data type
        double weight = 71.5;
        System.out.println(weight);

        // boolean data type
        boolean isWinter = false;
        boolean isSpring = true;
        boolean hasApples = true;

        // String
        String name = "Alexey";
        String surname = "K";
        String age = "31";

        // Concatenation
        String fullName = name + " " + surname;
        System.out.println(fullName);

        //String fullNameWithAge = fullName + " " + myCurrentAge;
       //System.out.println(fullNameWithAge);

        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);
        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);

        //*
        int a = 10;
        int b = 20;
        int c = a * b;
        int d = a / b;
        System.out.println(c);
        double result = (double) a / b;
        System.out.println(result);
        // System.out.println(10 * 20);
        // System.out.println(a * b);

        // %
        int number = 10 % 9;
        System.out.println(number);

        // number massive
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
    // new comments form branch
}
