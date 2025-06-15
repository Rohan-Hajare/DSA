package DSA.Stack;

import java.util.Stack;

public class ValidParanthesis {

    static boolean isValid(String exp)
    {
        Stack<Character> s=new Stack<Character>();
        for (int i = 0; i < exp.length(); i++) {
            char ch=exp.charAt(i);

            if(ch=='{' ||  ch=='(' || ch=='[' )
            {
                s.push(ch);
            }
            else
            {
                if(!s.isEmpty())
                {
                    char top=s.peek();
                    if((top=='{' && ch=='}')  || (top=='[' && ch==']'  ) || (top=='(' && ch==')' ) )
                    {
                        s.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }


        }
        if(s.isEmpty())
            return true;
        else
            return false;

    }
    public static void main(String[] args) {

        String exp="()[]{}";
        System.out.println(isValid(exp));

    }
}
