import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindMissingNumber {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10));
        Integer missing = missingFinder(list);
        System.out.println(missing);
    }

    private static Integer missingFinder(List<Integer> list) {
        List<Integer> list2 = new ArrayList<>();
        for (int i = 1; i < 100; i++) {
            list2.add(i);
        }
        if(list.isEmpty()){
            return null;
        }
        for (int j = 0; j < list2.size(); j++) {
            if(!Objects.equals(list.get(j), list2.get(j))){
                return list2.get(j);
            }
        }
        return null;
    }
}