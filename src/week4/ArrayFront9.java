package week4;

/**
 * Created by Xiaobin Wang on 1/30/2017.
 */
public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        int a = nums.length;
        boolean c = false;
        if (nums.length > 4) {
            for (int i = 0; i < a; i++) {
                if (nums[i] == 9) {
                    c = true;
                }


            }
        } else {
            for (int i = 0; i < a; i++) {
                if (nums[i] == 9) {
                    c = true;
                }

            }
        }
    return c;}
    public static void main(String[] args) {
        int N = args.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
    }
}



