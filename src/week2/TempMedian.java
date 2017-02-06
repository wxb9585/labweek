package week2;

import java.util.DoubleSummaryStatistics;
import java.util.Arrays;

/**
 * Created by Xiaobin Wang on 1/27/2017.
 */
public class TempMedian {
    public static void main(String[] args) {
        int i = 0;
        String[] d = new String[args.length];
        for (i = 0; i < args.length; i++) {
            d[i] = args[i];
            if (d[i].equals(".")) {
                d[i] = d[i - 1];

            } else if (d[i].equals("+")) {
                d[i] = String.valueOf(Integer.parseInt(d[i - 1]) + 1);

            } else if (d[i].equals("-")) {
                d[i] = String.valueOf(Integer.parseInt(d[i - 1]) - 1);

            } else {
                d[i] = d[i];

            }
        }
        int[] f = new int[args.length];
        int h = 0;
        for (h = 0; h < args.length; h++) {
            f[h] = Integer.parseInt(d[h]);

        }
         Arrays.sort(f);
        int e = 0;
        while(e<args.length){
            System.out.print(f[e]+" ");
            e++;
        }

        if ((args.length) % 2 == 0) {
            int k = (f[(args.length/2)] + f[((args.length)/2)+1])/2;
            System.out.print(k);
        } else {
            System.out.print(f[((args.length) / 2)+1]);
        }
    }




}

