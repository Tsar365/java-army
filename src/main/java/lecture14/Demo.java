package main.java.lecture14;

// Call by Value

public class Demo {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        System.out.println(x + " , " + y);

        addTen(x, y);

        System.out.println(x + " , " + y);

    }

    static void addTen(int x, int y) { //addTen() er x,y er value copy hoise
        x = x + 10;
        y = y + 10;
    }
}