import java.util.ArrayList;
import java.util.List;

public class AliceOrBobWin {
    public static void main(String[] args) {

    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> wins = new ArrayList<>();
        int aliceWin = 0;
        int bobWin = 0;
        int draws = 0;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i)> b.get(i)){
                aliceWin += 1;

            }else if(a.get(i) == b.get(i)){

                draws += 1;
            }else{
                bobWin += 1;
            }
        }
        wins.add(aliceWin);
        wins.add(bobWin);
        return wins;
    }
}