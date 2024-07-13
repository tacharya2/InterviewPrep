import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8,9,7,4,4,1,2,3,1,5, 4,9));

        Map<Integer, Integer> map = new HashMap<>();

        for (Integer element : list) {
            map.put(element, map.getOrDefault(element, 0) + 1);
        }
        System.out.println(map);
    }
}