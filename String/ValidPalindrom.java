package DSA.String;

//changes are made here

public class ValidPalindrom {

    public static void main(String[] args)
    {
        String str1="A man, a plan, a canal: Panama";


//        System.out.println(Character.isLetterOrDigit(str1.charAt(2)));
        System.out.println(isPalindrom(str1));
    }
    static boolean isPalindrom(String str)
    {
        int s=0;
        int e=str.length()-1;
        while(s<=e)
        {
            char currS=str.charAt(s);
            char currE=str.charAt(e);

            if(!Character.isLetterOrDigit(currS))
            {
                s++;
            }
            else  if(!Character.isLetterOrDigit(currE))
            {
                e--;
            }
            else
            {

                if(Character.toLowerCase(currS)!=Character.toLowerCase(currE))
                {
                    return false;
                }
                s++;
                e--;
            }


        }
        return true;

    }
}
