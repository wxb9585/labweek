package week4;

/**
 * Created by Xiaobin Wang on 1/30/2017.
 */
public class NoTriples {
    public static boolean noTriples(int[] nums){
        boolean a = true;
        if(nums.length>=3){
        for(int i = 0;i<nums.length-2;i++){
        if ((nums[i]==nums[i+1])&&(nums[i+1]==nums[i+2])){
            a = false;
        }
        }

    }


    return a;
    }

    public static void main(String[] args){
        int[] nums = new int[args.length];
        for(int i = 0;i<args.length;i++){
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.print(noTriples(nums));

    }

}
