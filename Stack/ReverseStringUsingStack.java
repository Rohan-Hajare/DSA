package DSA.Stack;

import java.util.Stack;

public class ReverseStringUsingStack
{
    public static void main(String[] args) {

        String str="Rohan Hajare";
        Stack<Character> s=new Stack<>();
       char ch;
        for (int i = 0; i <str.length() ; i++) {
            ch = str.charAt(i);
            s.push(ch);
        }
       String ans="";
        while(!s.isEmpty()) {
           ch=s.peek();
           ans+=ch;
           s.pop();
        }
        System.out.println(ans);
    }
}
