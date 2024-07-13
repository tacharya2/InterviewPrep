import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class LowestUniquePositionFinder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine())!= null){
           String [] numbers =  str.split(" ");
           int winnerPosition = winnerPositionFinder(numbers);
            System.out.println(winnerPosition);
        }
    }
    private static int winnerPositionFinder(String[] numbers) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for(String number:numbers){
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        System.out.println(frequencyMap);

        int lowestUnique = Integer.MAX_VALUE;
        int winnerPosition = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(frequencyMap.get(numbers[i]) == 1){
                int num = Integer.parseInt(numbers[i]);
                if(num < lowestUnique){
                    lowestUnique = num;
                    winnerPosition = i + 1;
                }
            }
        }
        return winnerPosition;
    }
}
