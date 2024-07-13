package map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        concurrentMap.put("One", 1);
        concurrentMap.put("Two", 2);
        concurrentMap.put("Three", 3);

        // Concurrent read
        System.out.println("Value for key 'Two': " + concurrentMap.get("Two"));

        // Concurrent update
        concurrentMap.compute("Three", (key, value) -> value + 10);

        // Concurrent iteration
        concurrentMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

