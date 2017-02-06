package week5;

/**
 * Created by Xiaobin Wang on 2/2/2017.
 */
public class SplitPathName {
    public static String[] splitPath(String s){
        String[] a = new String[4];
        if(s.indexOf("/")==-1){
            if(s.indexOf(".")==-1){
            a[0] = "";
            a[1] = s;
            a[2] = s;
            a[3] = "";
            }
            else{
                a[0] = "";
                a[1] = s;
                a[2] = s.substring(0,s.lastIndexOf("."));
                a[3] = s.substring(s.lastIndexOf("."));
            }
        }else{
            if(s.indexOf(".")==-1){
                a[0] = s.substring(0,s.lastIndexOf("/")+1);
                a[1] = s.substring(s.lastIndexOf("/")+1);
                a[2] = s.substring(s.lastIndexOf("/")+1);
                a[3] ="";
        }else {
                a[0] = s.substring(0,s.lastIndexOf("/")+1);
                a[1] = s.substring(s.lastIndexOf("/")+1);
                a[2]= s.substring((s.lastIndexOf("/")+1) , (s.lastIndexOf(".")));
                a[3]=s.substring(s.lastIndexOf("."));

            }
        }
        return a;
}
    public static void main(String[] args){
        for(int i = 0;i<args.length;i++){
        String b = new String(args[i]);
        System.out.printf("File: %s Type: %s [%s]\n", splitPath(b)[1], splitPath(b)[3], splitPath(b)[0]);

    }
}}
