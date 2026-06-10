package main.java.lecture13;

public class ConstructorWithParameter {
    public static void main(String[] args) {
        Students s1 = new Students("Rohit", 28, 102, "IIT G");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        Students s2 = new Students();
    }
}

class Students {
    String name;
    int age;
    int rollNumber;
    String college;

    // default constructor
    Students() {
//        name = "Ehsan";
//        age = 23;
//        rollNumber = 123;
//        college = "abcd";
    }

    Students(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rollNumber = rn;
        college = c;
    }

    void markAttendance() {
        System.out.println("Attendance marked for student " + name);
    }
}
