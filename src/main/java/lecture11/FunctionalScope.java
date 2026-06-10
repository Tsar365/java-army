package main.java.lecture11;

public class FunctionalScope {
    static String name = "Aditya"; // global scope. static keyword must dte hbe

    static void main() {

        // Scope of a variable

        int x = 4;  // local scope
        int y = 5;

        if(x == 4) {
            int j = 7;
            System.out.println(j);
        }

        System.out.println(x + " , " + y);

        System.out.println(name);

        fun();
    }

    static void fun() {
        int x = 4;  // local scope
        int y = 5;
        System.out.println(x + " , " + y);

        System.out.println(name);
    }
}
