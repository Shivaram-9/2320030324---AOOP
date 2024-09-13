package fruitcollection;

import java.util.Set;
import java.util.TreeSet;

public class FruitSetDemo {
    public static void main(String[] args) {
        // Create a TreeSet to store fruits
        Set<String> fruits = new TreeSet<>();
        
        // Add fruits to the set
        fruits.add("Mango");
        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add("Strawberry");
        fruits.add("Blueberry");
        fruits.add("Peach");
        fruits.add("Kiwi");

        // Iterate over the TreeSet and print fruits in alphabetical order
        System.out.println("Fruits in alphabetical order:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
