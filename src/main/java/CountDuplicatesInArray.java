import java.util.*;

//Write jva code that counts duplicates in an ArrayLists
public class CountDuplicatesInArray {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1,2,3,5,2,3,1,5,6,4,8,10,1));

        Map<Integer, Integer> map = countDuplicates(array);
        System.out.println(map.size());
        List<Integer> valueList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();
            valueList.add(value);
            System.out.println(key + " occurs "+ value + " times");
        }
        System.out.println(findFirstUniqueValueInMap(map)+" for ");
    }
    public static Map<Integer, Integer> countDuplicates(List<Integer> list){
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(int number:list){
            countMap.put(number, countMap.getOrDefault(number,0) + 1);
        }
        return countMap;
    }
    public static int findFirstUniqueValueInMap(Map<Integer, Integer> map){
        int uniqueVal = Integer.MAX_VALUE;
        int position = -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

        }

        return uniqueVal;
    }
}
