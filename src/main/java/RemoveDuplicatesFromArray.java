import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int [] arr = {9, 3, 7, 9, 3, 1, 6, 5, 4, 5, 7, 8, 9, 7, 2, 1};

        Set<Integer> list = new HashSet<>();

        for (int el : arr){
            list.add(el);
        }
        System.out.println(list);
    }
}