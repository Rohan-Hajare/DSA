package DSA.String;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1="tea";
        String str2="eat";

        boolean b = chechkAnagraam(str1,str2);
        System.out.println(b);
    }

    static boolean chechkAnagraam(String str1, String str2)
    {
        String[] s1 =str1.split("");
        String[] s2 =str2.split("");

        if(s1.length==s2.length)
        {
            Arrays.sort(s1);
            Arrays.sort(s2);
            for(int i=0; i<s1.length; i++) {
                if (s1[i].equals(s2[i])) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}
