package week5;

/**
 * Created by Xiaobin Wang on 2/4/2017.
 */
public class OneTimePadDecipher {
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


    public static String decipher(String encipheredText, String onetimepad) {
        // ADD CODE HERE
        int[] c = new int[encipheredText.length()];
        for(int i=0;i<encipheredText.length();i++){
            c[i]=charToInt(encipheredText.charAt(i));

        }
        int[] d = new int[onetimepad.length()];
        for(int i = 0;i<onetimepad.length();i++){
            d[i]=charToInt(onetimepad.charAt(i));
        }
        int[] e = new int[encipheredText.length()];
        int[] f = new int[encipheredText.length()];
        for(int i = 0;i<encipheredText.length();i++){
            e[i] = c[i] - d[i] + 26;
            f[i] = e[i]%26;
        }
        char[] k = new char[encipheredText.length()];
        for(int i = 0;i<encipheredText.length();i++){
            if(intToChar(f[i])!='P'){


            k[i] = intToChar(f[i]);
        }else{
            k[i] = ' ';

            }}
        String ans ;
        ans = new String(k);
        return ans.toUpperCase();

    }

}
