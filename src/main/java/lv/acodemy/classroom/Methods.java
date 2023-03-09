package lv.acodemy.classroom;

public class Methods {
    public static void main(String[] args) {
        printText("My name is A", 5 );
    }

    public static void printText(String text, int loopCount) {
        for (int i = 0; i < loopCount ; i++) {
            System.out.println(text);
        }
    }
}
