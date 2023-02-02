import Fruits.Apple;
import Fruits.Fruit;
import Fruits.Orange;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Fruit> fruits = Arrays.asList(
                new Apple(1),
                new Orange(4),
                new Apple(0),
                new Apple(2),
                new Orange(4), // Duplicate
                new Apple(1), // Duplicate
                new Orange(3)
        );


        // Printout the list

        System.out.println("THE LIST OF FRUITS:");

        Iterator<Fruit> fruitsIterator = fruits.iterator();

        while (fruitsIterator.hasNext()){
            Fruit singleFruit = fruitsIterator.next();
            System.out.println(singleFruit);
        }




        DupeFinder<Fruit> dupeFinder = new DupeFinder<>(fruits);

        System.out.println("THE NUMBER OF DUPLICATE FRUITS:");

        // Printout the number of duplicate fruits
        System.out.println(dupeFinder.checkDupes());

        System.out.println("THE LIST OF DUPLICATE FRUITS:");

        // Printout the list of duplicate in the fruit list
        System.out.println(dupeFinder.getDupes());

        System.out.println("SORTED DUPLICATES IN REVERSE ORDER:");


        System.out.println(dupeFinder.sortedDupes());




    }

}