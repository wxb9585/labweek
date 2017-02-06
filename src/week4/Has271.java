package week4;

/**
 * Created by Xiaobin Wang on 1/30/2017.
 */
public class Has271 {

    public static boolean has271(int[] nums){
        boolean a = false;
        if(nums.length>=3){
            for(int i =0;i<nums.length-2;i++){
                if((nums[i+1]==(nums[i]+5)&&(nums[i+2]==(nums[i]-1)))){
                    a = true;
                }

            }
        }
        return a;
        }



    }

