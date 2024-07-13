package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterationStream {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Iterate using Java 8 streams
        hashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}
