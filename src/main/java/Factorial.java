import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Factorial {
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine().trim());
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        System.out.println(factorial(n));
    }
}
