//https://chat.openai.com/share/7468fad0-086a-4b96-b3f1-f7cede3ad350

/*
When working with a List, you can obtain a stream by calling the stream() method directly on the list.
For arrays, you can use the Arrays.stream(array) method to get a stream of elements from the array.
 */
package StreamProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctAndSorted {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Alice", "David", "Bob", "Eva");

        //Java Stream to create a new list with distinct and sorted names
        List<String> uniqueSortedNames = names.stream()
                .distinct() //Removes the duplicates
                .sorted() //Sort the names
                .collect(Collectors.toList());
        System.out.println("Original List:"+ names );
        System.out.println("Unique Sorted List: "+ uniqueSortedNames);
    }
}