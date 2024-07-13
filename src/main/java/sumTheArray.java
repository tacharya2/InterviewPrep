import static java.lang.Integer.sum;

public class sumTheArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,5,4,7,8,9,4,1,1,2,3,6,5,4,35,44};

        System.out.println(sum(arr));
    }
    private static int  sum(int[] arr) {
        int sum = 0;
        for(int el : arr){
            sum += el;
        }
        return sum;
    }
}