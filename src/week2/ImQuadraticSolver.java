package week2;

/**
 * Created by Xiaobin Wang on 1/25/2017.
 */
public class ImQuadraticSolver {
    public static void main(String[] args) {
        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        double C = Double.parseDouble(args[2]);
        if(((B*B)-4*A*C)>0){
            System.out.println((-B)/(2*A)+(Math.abs(Math.sqrt((B*B)-4*A*C))/2*A));
            System.out.println((-B)/(2*A)-(Math.abs(Math.sqrt((B*B)-4*A*C))/2*A));
        }
        else if(((B*B)-4*A*C)==0){
            System.out.println((-B)/(2*A));
        }
        else if(((B*B)-4*A*C)<0) {
            System.out.println(((-B) / (2 * A)) + "+" + (Math.sqrt(Math.abs((B * B) - 4 * A * C))) / (2 * A) + "i");
            System.out.println((-B)/(2*A)+"-"+(Math.sqrt(Math.abs((B*B)-4*A*C))/2*A)+"i");
        }

    }
}
