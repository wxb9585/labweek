package week2;

/**
 * Created by Xiaobin Wang on 1/23/2017.
 */
public class SquaresLoopRange {
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if(x<=y){
            for(int a = x;(a*a)<=(y*y);a++){
           System.out.println(a*a);}
       }
       else {
            System.out.print("Start is larger than end");

        }
    }
}
