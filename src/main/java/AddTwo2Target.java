import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AddTwo2Target {
    public static void main(String[] args) throws IOException {

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Enter numbers separated by spaces");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] inputString = br.readLine().split(" ");

        for(String num : inputString){
            try{
                int numbers = Integer.parseInt(num);
            arrayList.add(numbers);
            }catch (NumberFormatException e){
                System.out.println("Errors: " + e);
            }
        }

        System.out.println("Enter the target");

        int target = Integer.parseInt(br.readLine().trim());

        ArrayList<Integer> list3 = addTwoNumToTarget(arrayList, target);
        System.out.println(list3);
    }

    public static ArrayList<Integer> addTwoNumToTarget(ArrayList<Integer> list, int target){
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target){
                    list2.add(list.get(i));
                    list2.add(list.get(j));

                }
            }
            break;
        }
        return list2;
    }
}