import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,6,4,8,7,9,1,2,3,11,6,4,6,8, 10));
        Collections.sort(list);
        int target = 10;
        int foundAt = -1;
        for (int i = 0; i < list.size(); i++) {
            if(target == list.get(i)){
                foundAt = i + 1;
            }
        }

        System.out.println(search(list, target) + " found at index " + foundAt + " once sorted in ascending order");

    }
    public static Integer search(ArrayList<Integer>list,  int search){
        int left = 0;
        int right = list.size() - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(mid == search){
                return mid;
            }else if(mid < search){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
}