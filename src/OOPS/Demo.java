package OOPS;

public class Demo {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Prithvi";
        s1.age = 20;
        s1.rollNumber = 101;
        s1.college = "NSEC";

        s1.markAttendance();
        s1.print();

        Student s2 = new Student();
        s2.name = "Raj";
        s2.age = 21;
        s2.rollNumber = 102;
        s2.college = "NSEC";

        s2.markAttendance();
        s2.print();
    }
}

class Student {

    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(name + ", " + age + ", " + rollNumber + ", " + college);
    }
}
