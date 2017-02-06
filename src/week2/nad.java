package week2;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by Xiaobin Wang on 1/21/2017.
 */
public class nad {
    public static void main(String[] args){
        double X = Double.parseDouble(args[0]);
        double Y = Double.parseDouble(args[1]);
        if (Y != 0) {
            System.out.print(X / Y);
        }
        else {
            System.out.print("I cannot divide zero!!!!!");
        }
    }
}
