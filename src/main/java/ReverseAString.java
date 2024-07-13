import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().trim();
        System.out.println(reverseString(word));
    }

    public static String reverseString(String word) {

        Stack<Character> stack = new Stack<>();

        for (int i = word.length() - 1; i >= 0; i--) {
            stack.push(word.charAt(i));
        }
        System.out.println("My Stack: "+stack); // produce an array of reversed characters
        StringBuilder str = new StringBuilder();
        for (char element : stack) {
            str.append(element);
        }
        return str.toString(); // produce a string of reversed characters
    }
}