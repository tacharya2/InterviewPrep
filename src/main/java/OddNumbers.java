import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int l = 3;
        int r = 9;
        System.out.println(oddNumbers(l, r));

    }
    public static List<Integer> oddNumbers(int l, int r){
        List<Integer> list1  = new ArrayList<>();

        for(int i = l; i <= r; i++){
            list1.add(i);
        }
        return list1;
    }
}