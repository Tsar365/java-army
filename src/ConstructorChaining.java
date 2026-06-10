public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("Aditya");
         Student s3 = new Student("Rohit", 28);
        // Student s4 = new Student("Rohan", 30, 103);
        // Student s5 = new Student("Mohan", 31, 104, "IIT Bombay");

        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
}
// Constructor chaining
class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        this("Unknown"); //1 parameterwala contructor k call krse. Alwz contructor call krar por first line e hote hbe
        System.out.println("I am in first constructor");
    }

    Student(String name) {
//        this.name=name;
        this(name, 0); //2 parameterwala contructor k call krse.Alwz contructor call krar por first line e hote hbe
        System.out.println("I am in second constructor");
    }

    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
        this(name, age, 0); //3 parameterwala contructor k call krse.Alwz contructor call krar por first line e hote hbe
        System.out.println("I am in third constructor");
    }

    Student(String name, int age, int rollNumber) {
//        this.name = name;
//        this.age = age;
//        this.rollNumber = rollNumber;
        this(name, age, rollNumber, "Unknown");//4 parameterwala contructor k call krse.Alwz contructor call krar por first line e hote hbe
        System.out.println("I am in fourth constructor");
    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;

        System.out.println("I am in fifth constructor");
    }

    void markAttendance() {
        System.out.println("Attendance marked for student " + name);
    }
}
