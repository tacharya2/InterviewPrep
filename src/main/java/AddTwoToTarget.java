import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//This program finds the first two from a list of integers to add to make the target integer
public class AddTwoToTarget {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> arr = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine().trim();

        int targetNum = Integer.parseInt(br.readLine().trim());

        String [] numberStrings = line.split(" ");

        for(String numberString : numberStrings){
            int number = Integer.parseInt(numberString);
            arr.add(number);
            Collections.sort(arr);
        }
        ArrayList<Integer>list3 = addTwoFromArray(arr, targetNum);

        System.out.println(list3);
    }
    public static ArrayList<Integer> addTwoFromArray(ArrayList<Integer>list, int target){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) >= target){
                return null;
            }
            for (int j = 1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target){
                    list2.add(list.get(i));
                    list2.add(list.get(j));
                    return list2;
                }
            }
        }
        return null;
    }
}