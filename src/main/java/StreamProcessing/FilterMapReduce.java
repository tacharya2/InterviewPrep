package StreamProcessing;

import java.util.Arrays;
import java.util.List;

public class FilterMapReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

        int sum = numbers.stream()
                .filter(s -> s > 2 && s % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}