package week5;

/**
 * Created by Xiaobin Wang on 2/1/2017.
 */
public class C {
    public static void main(String y[]) {
        int first = Integer.parseInt(y[0]);
        int z = Integer.parseInt(y[1]);
        if (first <= z) {
            for (int i = first; i <= z; i++) {
                if ( i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println(first + " cannot be greater than " + z);
        }
    }
}

