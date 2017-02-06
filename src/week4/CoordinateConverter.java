package week4;

/**
 * Created by Xiaobin Wang on 1/30/2017.
 */
public class CoordinateConverter {

    public static double convertXYtoR(double x, double y) {
        // ADD CODE HERE
       double R ;
       R =Math.sqrt((x*x)+(y*y));
       return R;
    }

    public static double convertXYtoT(double x, double y) {
        // ADD CODE HERE
        double T;
        T = Math.atan2(y , x);
        return T;
    }


    public static double convertRTtoX(double r, double theta) {
        // ADD CODE HERE
        double X;
        X = (r *Math.cos(theta));
        return X;
    }

    public static double convertRTtoY(double r, double theta) {
        // ADD CODE HERE
        double Y;
        Y = (r * Math.sin(theta));
        return  Y;
    }

    public static double convertDegToRad(double deg) {
        // ADD CODE HERE
        double Rad;
        Rad = ((deg/180)*Math.PI);
        return Rad;
    }

    public static double convertRadToDeg(double rad) {
        // ADD CODE HERE
        double Deg;
        Deg = (rad/Math.PI)*180;
        return Deg;
    }

}

