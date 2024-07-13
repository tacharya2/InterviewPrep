import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine().trim());
        int y = Integer.parseInt(br.readLine().trim());

        System.out.println(addTwo(x, y));
    }
    public static int addTwo(int x, int y){
        return x + y;
    }
}
