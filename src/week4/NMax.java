package week4;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by Xiaobin Wang on 1/30/2017.
 */
public class NMax {
    public static double max(double a, double b, double c){
        return Math.max(a,Math.max(b,c));
    }


    public static int max(int a, int b, int c){
            return Math.max(a,Math.max(b,c));
        }



    public static void main(String[] args){
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
        int maximum = max(a, b, c);
        System.out.print(maximum);
    }

}
