import java.util.*;

public class HashMaps {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Tomato", 20);
        map.put("Potato", 40);
        map.put("Cucumber", 21);
        map.put("Carrot", 43);
        map.put("Plum", 25);
        map.put("Avocado", 49);

        System.out.println(map);
        System.out.println("Entry Set = " + map.entrySet());
        System.out.println(map.get("Avocado"));

        ArrayList<Integer> values = new ArrayList<>(map.values());
        System.out.println(values);
        System.out.println("List of keys: "+ map.keySet());

        System.out.println(positionOfSmallestValue(values));

        System.out.println( "The value for the key is " + findValue(map));
        System.out.println("The key for the value is = "+ findKey(map,25));
        map.clear();

        System.out.println(map+ ": Flushed");


    }
    public static int positionOfSmallestValue(ArrayList<Integer> arr) {
        int min = Collections.min(arr);
        int position = arr.indexOf(min) + 1;

        return position;
    }
    public static int findValue(Map<String, Integer> map){
        if(map.containsKey("Avocado")){
            int value = map.get("Avocado");
            return value;
        }else {
            return -1;
        }
    }
    public static String findKey(Map<String, Integer> map, int targetValue){
        for (Map.Entry<String, Integer> entry : map.entrySet()){
           if(entry.getValue() == targetValue){
               return entry.getKey();
           }
        }
        return "Not found";
    }
}

