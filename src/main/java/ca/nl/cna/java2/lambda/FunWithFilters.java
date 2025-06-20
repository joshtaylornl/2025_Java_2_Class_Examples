package ca.nl.cna.java2.lambda;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FunWithFilters {

    public static void main(String[] args) {
        System.out.println("Fun with Filters!");
        List<Integer> integerList = getRandomList(new Random().nextInt(30) + 20, 50);

        System.out.println("Printing Random List: ");
        integerList.forEach( i -> System.out.print(i + " "));

        integerList.sort((i,j)-> Integer.compare(i,j));

        System.out.println("\nPrinting Sorted List: ");
        integerList.forEach( i -> System.out.print(i + " "));

        //Filter random numbers to a list that is even and greater than 0;
        List<Integer> filteredList = integerList
                .stream()
                .filter(i -> {return ((i % 2 == 0) && (i > 0));})
                .toList();

        System.out.println("\nPrinting Filtered List: ");
        filteredList.forEach( i -> System.out.print(i + " "));
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
}
