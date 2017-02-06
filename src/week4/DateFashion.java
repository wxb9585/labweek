package week4;

/**
 * Created by Xiaobin Wang on 1/30/2017.
 */
public class DateFashion {
    public static int dateFashion(int you, int date){
        int c;
        if((you>2&&date>2)){
            if(you>=8||date>=8){
            c = 2;
        }else{
                c = 1;
            }
        }else {
            c = 0;
        }
        return c;
    }
    public static void main(String[] args){
        int you = Integer.parseInt(args[0]);
        int date = Integer.parseInt(args[1]);
        System.out.print(dateFashion(you,date));
    }
}
