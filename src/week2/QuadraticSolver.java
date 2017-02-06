package week2;

/**
 * Created by Xiaobin Wang on 1/20/2017.
 */
public class QuadraticSolver {
    public static void main (String[] args) {
        double A = Double.parseDouble(args [0]);
        double B = Double.parseDouble(args [1]);
        double C = Double.parseDouble(args [2]);
        double x1 = (-B + Math.sqrt((B*B)- 4 * A * C))/ (2*A);
        double x2 = (-B - Math.sqrt((B*B)- 4 * A * C))/ (2*A);
        if (((B * B) - 4 * A * C ) >= 0){
          System.out.println (x1 + " " + x2);}
          else { System.out.println ("irrational");}

    }
}
