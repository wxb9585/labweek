package week2;

/**
 * Created by Xiaobin Wang on 1/27/2017.
 */
public class ArrayRotate {
    public static void main(String[] args){
        int[] nums= new int[args.length];
        int i = 0;
        while (i<args.length){
            nums[i] = Integer.parseInt(args[i++]);

        }
        int[] copy = new int[args.length];
        int b = 0;
        for(i=1;i<args.length;i++){
        copy[b]= nums[i];
        b++;
        }
        copy[args.length-1]=nums[0];
        int n = 0;
        while(n<args.length){
            System.out.print(copy[n]+" ");
            n++;
        }
        System.out.println();
    }
}
