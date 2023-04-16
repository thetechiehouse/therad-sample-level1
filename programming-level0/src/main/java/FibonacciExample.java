import java.util.Scanner;

/*
// 1, 1, 2, 3, 5, 8
 */
public class FibonacciExample {


    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);
        int input = scn.nextInt();

        System.out.println(getNthFibonacciNumber(input));
    }

    private static int getNthFibonacciNumber(int n) {
        if (n < 3) {
            return 1;
        }

        int a = 1;
        int b = 1;
        int c = 0;
        int k;
        for (int i = 2; i < n; i++) {
            k = a;
            a = b;
            c = a + k;
            b = c;
        }
        return c;
    }
}