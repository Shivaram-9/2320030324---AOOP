package setoperations;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindMaxValue {
    public static void main(String[] args) {
        // Create a set of integers
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(25);
        integerSet.add(5);
        integerSet.add(30);
        integerSet.add(15);

        // Find the maximum value in the set
        Integer maxValue = Collections.max(integerSet);

        // Display the maximum value
        System.out.println("The maximum value in the set is: " + maxValue);
    }
}
