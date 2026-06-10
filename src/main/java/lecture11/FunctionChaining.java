package main.java.lecture11;

public class FunctionChaining {
    static void main() {
        // Chaining of functions

        fun1();
        System.out.println("main completed");
    }

    static void fun1() {
        fun2();
        System.out.println("fun1 completed");
    }

    static void fun2() {
        fun3();
        System.out.println("fun2 completed");
    }

    static void fun3() {
        System.out.println("fun3 completed");
    }

}

