package week4;

/**
 * Created by Xiaobin Wang on 2/1/2017.
 */
public class Factorial {
    public static int factorial(int N) {
        // ADD CODE HERE
        if (N == 1) {
            return 1;
        }
        return N * factorial(N-1);

    }

    public static void main(String[] args) {
        System.out.print(" 2! (Should be: 2) returned: " + factorial(2) );
        System.out.print(" 5! (Should be: 120) returned: " + factorial(5) );
        System.out.print(" 10! (Should be: 3628800) returned: " + factorial(10) );
    }
}

