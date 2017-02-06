package week5;

/**
 * Created by Xiaobin Wang on 2/1/2017.
 */
public class NbyN {
    public static int[][] nbyn(int N){
        int[][] a = new int[N][N];
        for(int i = 0;i<N; i++){
            for(int j = 0 ; j<N; j++){
                if(i==j){
                    a[i][j] = i;
                }else{
                    a[i][j] = 0;
                }

            }
        }
        return a;
    }
    public static void main(String[] args){

        int D[][] = nbyn(10);
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(D[i][j]+" ");

            }
            System.out.println();
        }


    }
}
