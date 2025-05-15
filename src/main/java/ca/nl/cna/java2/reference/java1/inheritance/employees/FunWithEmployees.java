package ca.nl.cna.java2.reference.java1.inheritance.employees;

public class FunWithEmployees {

    public static void main(String[] args) {
        System.out.println("Fun with Employees");

        for (int i = 0; i < 10; i++) {
            EmployeeFactory.generateRandomEmployee().printEmployees(System.out);
        }
    }

}
