package week2;

/**
 * Created by Xiaobin Wang on 1/27/2017.
 */
public class ArithmeticSeries {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int b = 1;
        int c = 0;
        while (b<=a){
            c = c + b;
            b++;
        }
        System.out.print(c);

    }
}
