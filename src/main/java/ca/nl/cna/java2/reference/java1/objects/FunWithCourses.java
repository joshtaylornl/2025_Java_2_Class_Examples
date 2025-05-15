package ca.nl.cna.java2.reference.java1.objects;

public class FunWithCourses {

    public static void main(String[] args) {
        System.out.println("Fun with Courses!");

        Course course = new Course("CP2280","Object-Oriented Programming in Java",
                "This course is a OOP course in Java.",4);

        System.out.println("\n");

        course.printStudent(System.out);

        System.out.println("Static approach:\n");

        Course.printStudent(course, System.out);

    }

}
