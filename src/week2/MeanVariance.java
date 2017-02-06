package week2;

/**
 * Created by Xiaobin Wang on 1/27/2017.
 */
public class MeanVariance {
    public static void main(String[] args){
        double a[] = new double[args.length];
        int i = 0;
        while(i<args.length){
            a[i]= Double.parseDouble(args[i]);
            i++;
        }
        int n = 0;
        double v = 0;
        while(n<args.length){
            v = v + a[n];
            n++;
        }
        v=v/(args.length);
        System.out.println(v);
        double variance = 0;
        int x = 0;
        double c = 0;
        while(x<args.length){
            variance = Math.pow((a[x]-v),2)/(args.length);
            x++;
            c=c+variance;
        }
        System.out.println(c);

    }
}
