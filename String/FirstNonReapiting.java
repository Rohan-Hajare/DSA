package DSA.String;

import java.util.HashSet;
import java.util.Set;

public class FirstNonReapiting {

    public static void main(String[] args) {

        String s="aabb";
//        System.out.println(s.charAt(2)-'a');
//        System.out.println(nonReapiting(s));
    }

    static int nonReapiting(String s)
    {
        String[] str=s.split("");

        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str.length;j++)
            {
                if(str[i].equals(str[j]))
                {
                    break;
                }

            }
        }



        return -1;

    }
}
