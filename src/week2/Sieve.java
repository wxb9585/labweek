package week2;

/**
 * Created by Xiaobin Wang on 1/28/2017.
 */
public class Sieve {
    public static void main(String[] args){
        int[] sieved_numbers = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int p = 2;
        int n = 20;

        for(int a=0;a<sieved_numbers.length;a++ ){
               if(sieved_numbers[a]!=0){
                   System.out.print(sieved_numbers[a]+" ");
                   p = sieved_numbers[a];
                   for(int b = 0;b<sieved_numbers.length;b++){
                       if ((sieved_numbers[b]%p)==0) {
                           sieved_numbers[b]=0;
                       }
                   }
               }
               }

           }
              }




