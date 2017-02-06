package week5;

/**
 * Created by Xiaobin Wang on 2/4/2017.
 */
public class OneTimePadEncipher {

    public static int charToInt(char l) {
        // ADD CODE HERE
        // Should convert a character to an integer, for example 'a' -> 0, 'b' -> 1
        int cti = Character.toLowerCase(l)- 'a';
        return cti;
    }

    public static char intToChar(int i) {
        // ADD CODE HERE
        // Should convert an integer to a character, for example 0 -> 'a', b -> '1'
        // it should always return lower case chae
        char itc = (char) (i + (int)'a');
        return itc;
    }


    public static String encipher(String original, String onetimepad) {
        // ADD CODE HERE
        int[] c = new int[original.length()];
        for(int i=0;i<original.length();i++){
            c[i]=charToInt(original.charAt(i));
        }
        int[] d = new int[onetimepad.length()];
        for(int i = 0;i<onetimepad.length();i++){
            d[i]=charToInt(onetimepad.charAt(i));
        }
        int[] e = new int[original.length()];
        int[] f = new int[original.length()];
        for(int i = 0;i<original.length();i++){
            e[i] = c[i] + d[i];
            f[i] = e[i]%26;
        }
        char[] k = new char[original.length()];
        for(int i = 0;i<original.length();i++){
            if(intToChar(f[i])!='X'){
         k[i] = intToChar(f[i]);
        }else{
                k[i] = ' ';
            }
        }
        String ans ;
        ans = new String(k);
        return ans;

    }


    public static void main(String[] args) {
        String ciphertext = encipher("HELLO EVERYBODY", "MYSECRETKETMYSECRETKEY");
        System.out.print(ciphertext);
    }

}
