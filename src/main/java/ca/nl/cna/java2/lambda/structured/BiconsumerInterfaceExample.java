package ca.nl.cna.java2.lambda.structured;

import java.util.function.BiConsumer;

public class BiconsumerInterfaceExample {
    public static void main(String[] args) {
//        BiConsumer<Integer, Integer> multiply = (x, y) ->
//                System.out.println("Multiplication of the two numbers is: "+x*y);
//        BiConsumer<Integer, Integer> divide = (x,y) ->
//                System.out.println("Division of the two numbers is: "+x/y);
//
//        System.out.printf("Using the functional interfaces %d", 1);
//        multiply.andThen(divide).accept(10,5);

        // Define a BiConsumer to print a message with two arguments
        BiConsumer<String, Integer> printMessage = (name, age) ->
                System.out.println("Name: " + name + ", Age: " + age);

        // Use the BiConsumer to perform the operation
        printMessage.accept("Alice", 30);
        printMessage.accept("Bob", 25);


    }
}
