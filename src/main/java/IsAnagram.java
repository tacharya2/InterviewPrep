import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class IsAnagram {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word1 = "";
        String word2 = "";
        try{
        word1 = br.readLine().trim();
        word2 = br.readLine().trim();
    }catch (IOException ex){
            System.err.println("An IOException occurred: " + ex.getMessage());
            ex.printStackTrace();
        }
        word1 = word1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        word2 = word2.replaceAll("[^a-zA-Z]", "").toLowerCase();
        System.out.println(palindrome(word1, word2));
}
    private static boolean palindrome(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        char [] list1 = word1.toCharArray();
        char [] list2 = word2.toCharArray();
        Arrays.sort(list1);
        Arrays.sort(list2);

        return Arrays.equals(list1, list2);
    }
}