import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17));

        ArrayList<Integer> mergedArray = arrayMerger(array1, array2);
        System.out.println(mergedArray);
    }
    private static ArrayList<Integer> arrayMerger(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(array1);
        list.addAll(array2);
        Collections.sort(list);
        return list;
    }
}