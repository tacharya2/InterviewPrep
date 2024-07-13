

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ArrayList<String> list = determiner(N);
        System.out.println(list);

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i),0) + 1);
        }
        System.out.println(map);
    }
    public static ArrayList<String> determiner(int N){
        ArrayList<String> list = new ArrayList<>();
        for (int i = N; i >=0; i--) {
            if(i % 3 == 0 && i % 5 == 0){
                list.add("FizzBuzz");
            } else if (i % 5 == 0) {
               list.add("Buzz");
            }else if(i % 3 == 0){
                list.add("Fizz");
            }
        }
        return list;
    }
}
