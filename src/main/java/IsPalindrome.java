import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().trim();

        boolean decision = palindromeWord(word);
        System.out.println(decision);

    }

    public static boolean palindromeWord(String word) {

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
