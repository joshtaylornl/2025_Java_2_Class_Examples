package ca.nl.cna.java2.lambda;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Playing around with List objects. Showing the differences in implementation and how to iterate
 *
 * @author Josh
 */
public class FunWithLambdasInLists {

    public static void main(String[] args) {
        System.out.println("Fun with Lists!");

        List<Integer> integerList = getRandomList(new Random().nextInt(30) + 20, 50);
        System.out.println("\n\nUsing the .forEach method and Lambda! Good Approach");
        integerList.forEach(i -> System.out.printf("%d,", i));

        //Either one of these options work!
        System.out.println("\nLet's Sort! Using Lambda");
        //Option 1
        //integerList.sort((x,y) -> Integer.compare(x,y));
        //Option 2
        integerList.sort(Integer::compareTo);

        System.out.println("\n\nPrint Sorted List");
        integerList.forEach(i -> System.out.printf("%d,", i));

    }

    /**
     * Great a random list of integers between 10 and 40
     * @return
     */
    public static List<Integer> getRandomList(int listSize, int upperBound){
        Random random = new Random();
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < listSize; i++) {
            list.add(random.nextInt(upperBound) - 25);
        }
        return list;
    }

    /**
     * Print out the list as CSV to the print stream
      * @param list
     * @param printStream
     */
    public static void printIntegerList(List<Integer> list, PrintStream printStream){
        list.forEach(i -> printStream.printf("%d,", i));
    }

}
