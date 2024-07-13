package map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Winner {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;

        while ((line = in.readLine()) != null) {
            String[] numbers = line.split(" ");
            System.out.println(Arrays.toString(numbers));
            int winnerPosition = findWinnerPosition(numbers);
            System.out.println(winnerPosition);
        }
    }
    public static int findWinnerPosition(String[] numbers) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (String number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
            System.out.println(frequencyMap);
        }

        // Find the lowest unique number and its position
        int lowestUnique = Integer.MAX_VALUE;
        int winnerPosition = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (frequencyMap.get(numbers[i]) == 1) {
                int num = Integer.parseInt(numbers[i]);
                if (num < lowestUnique) {
                    lowestUnique = num;
                    winnerPosition = i + 1;
                }
            }
        }

        return winnerPosition;
    }

}
