package OOPS;

class Test {
    String name;
    int age;
    int roll;
    String college;

    Test() {
        name = "Unknown";
        age = 0;
        roll = 0;
        college = "NSEC";
    }

    Test(String n, int a) {
        name = n;
        age = a;
    }

    Test(String n, int a, int r, String c) {
        name = n;
        age = a;
        roll = r;
        college = c;
    }

    public static void main(String[] args) {

        Test s1 = new Test();
        Test s2 = new Test("Prithvi", 20 );
        Test s3 = new Test("Rahul", 21, 102, "NSEC");

        System.out.println("Student 1:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Roll: " + s1.roll);
        System.out.println("College: " + s1.college);

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
        System.out.println("Roll: " + s2.roll);
        System.out.println("College: " + s2.college);

        System.out.println("\nStudent 3:");
        System.out.println("Name: " + s3.name);
        System.out.println("Age: " + s3.age);
        System.out.println("Roll: " + s3.roll);
        System.out.println("College: " + s3.college);
    }
}