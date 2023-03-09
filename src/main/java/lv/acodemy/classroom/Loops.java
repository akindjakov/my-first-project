package lv.acodemy.classroom;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        /*
        for(int i = 0; i < 10; i++) {
        //define counter;
        //condition
        //increment
         */

        //for (int i = 0; i < 5; i++) {
        //    System.out.println("Hello world!");
        //numbers[0] = 1
        //number[1] = 2

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        //print - print row; println - print column

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(" " + numbers[i]);
            }
        }

        System.out.println("---------------------");
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("++++++++++++++++++++");
        // Create String array with 10 names
        // print all names using for & for each

        String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
        System.out.println(names.length);
        System.out.println(Arrays.toString(names));
        // To print out text from massive we have to add class Arrays Arrays.toString()
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println("\n ----/ /----");
        // for each
        for (String name :
                names) {
            System.out.println(name);
        }
        System.out.println("\n ----/ /----");

        // do, do while

        /*
        do {
        //code to be executed
        }(while is true)
         */

        int i = 0;
        do {
            System.out.println(i);
            i++; // увеличивает на единицу предыдущие полученное значение из цикла
        } while (i<=10);
        System.out.println("\n !!!!!!!/ /----");
        int x = 0;
        while (x<=10) {
            System.out.println(i);
            x++; // увеличивает на единицу предыдущие полученное значение из цикла
        }
        int[] arrayOfNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] emptyArray = new int[arrayOfNum.length];

        for (int j = 0; j < arrayOfNum.length; j++) {
            emptyArray[j] = arrayOfNum[j];
        }
        System.out.println(Arrays.toString(emptyArray)); // чтоб увидеть конечный результат , print необходимо вывесть за скобки цикла
        }

    }
