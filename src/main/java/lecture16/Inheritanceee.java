package main.java.lecture16;

public class Inheritanceee {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.markAttendance();
        es.attendLab();

        Students s1 = new Students();
        s1.markAttendance();
        // s1.attendLab(); (wrong)
    }
}

/*
parent (Superclass) --> child (subclass)
*/

class Students {
    String name;
    int age;

    public void markAttendance() {
        System.out.println("Attendance marked");
    }
}

class EngineeringStudent extends Students {
    void attendLab() {
        System.out.println("lab attended");
    }
}
