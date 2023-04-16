import java.util.ArrayList;
import java.util.List;

/*
Input: n = 6 A[] = {16,17,4,3,5,2} Output: 17 5 2 Explanation:
The first leader is 17 as it is greater than all the elements to its right.
 Similarly, the next leader is 5.
 The right most element is always a leader so it is also included.
 */
public class LeaderExtractor {


    public void extractLeaders(int[] input) {
        for (int i = 0; i < input.length; i++) {
            boolean isLeader = checkForLeader(i, input);
            if (isLeader) {
                System.out.print(input[i]);
                System.out.print(" ");

            }
        }
    }

    private boolean checkForLeader(int i, int[] input) {
        int candidate = input[i];
        for (int j = i; j < input.length; j++) {
            if (candidate < input[j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int[] input = {16, 17, 4, 3, 5, 2};
        LeaderExtractor leaderExtractor = new LeaderExtractor();
        leaderExtractor.extractLeaders(input);
    }

}