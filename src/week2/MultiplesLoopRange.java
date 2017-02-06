package week2;

/**
 * Created by Xiaobin Wang on 1/23/2017.
 */
public class MultiplesLoopRange {
    public static void main(String[] args) {
        int X = Integer.parseInt(args[0]);
        int Y = Integer.parseInt(args[1]);
        int Z = Integer.parseInt(args[2]);
        if (X <= Y) {
            for (int a = X; a <= Y; a++) {
                if (a % Z == 0) {
                    System.out.println(a);
                }
            }
        }
        else {
            for (int a = X;a>=Y;a--){
                if (a % Z == 0) {
                    System.out.println(a);
            }
        }
    }
}
}
