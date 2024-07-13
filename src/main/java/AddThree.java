import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddThree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine().trim());
        int y = Integer.parseInt(br.readLine().trim());
        int z = Integer.parseInt(br.readLine().trim());

        System.out.println(addThree(x, y, z));
    }
    public static int addThree(int x, int y, int z ){
        return 2 * x * (y + z);
    }
}