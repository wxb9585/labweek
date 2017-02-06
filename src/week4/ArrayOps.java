package week4;

/**
 * Created by Xiaobin Wang on 1/31/2017.
 */
public class ArrayOps {
    public static double findMax(double[] data) {
        // ADD CODE HERE
        double a = data[0];
        for(int i=0;i<data.length-1;i++){
            if(a<data[i+1]){
                a = data[i+1];
            }
        }
        return a;
    }

    public static double[] normalise(double data[]) {
        // ADD CODE HERE
        double b = 0;
        double[] c = new double[data.length];
        for(int i = 0;i<data.length;i++){
            b = b + data[i];
        }
        for(int i = 0;i<data.length;i++){
            c[i] = (data[i]/b);
        }
        return c;
    }

    public static void normaliseInPlace(double data[]) {
        // ADD CODE HERE
        double b = 0;
        for(int i = 0; i<data.length;i++){
            b = b + data[i];
        }
        for(int i = 0;i<data.length;i++){
            data[i] = (data[i]/b);

        }
    }

    public static double[] reverse(double[] data) {
        // ADD CODE HERE
        double data1[] = new double[data.length];
        for(int i = 0; i<data.length;i++){
           data1[data.length-i-1]= data[i];

        }
        return data1;

    }

    public static void reverseInPlace(double[] data) {
        // ADD CODE HERE
        double data1[] = new double[data.length];
        for(int i = 0; i<data.length;i++){
            data1[data.length-i-1]= data[i];
        }
        for(int i = 0; i<data.length;i++){
            data[i]=data1[i];
        }
    }

    public static void swap(double[] data1, double[] data2) {
        // ADD CODE HERE
        double[] a = new double[data1.length];
        for (int i = 0; i< data1.length; i++){
            a[i] = data1[i];
            data1[i]=data2[i];
            data2[i]=a[i];
        }

    }


}
