package StreamProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> nestedLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flatList = nestedLists.stream()
                .flatMap(List::stream) // Flatten the nested lists
                .collect(Collectors.toList());

        System.out.println(flatList); // Output: [1, 2, 3, 4, 5, 6, 7, 8]

    }
}
