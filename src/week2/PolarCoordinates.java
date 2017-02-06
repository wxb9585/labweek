package week2;

/**
 * Created by Xiaobin Wang on 1/20/2017.
 */
public class PolarCoordinates {
    public static void main (String[] args){
    double X = Double.parseDouble(args[0]);
    double Y = Double.parseDouble(args[1]);
    double R = (X*X)+(Y*Y);
    double angle = Math.atan2 (Y,X);
    System.out.println(R);
    System.out.println(angle);
    }

}
