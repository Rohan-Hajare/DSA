package DSA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class InsertAtBottom {
  static void  insert(Stack<Integer> s,int x)
   {
      if(s.isEmpty())
      {
          s.push(x);
          return;
      }

       int num=s.peek();
        s.pop();

        insert(s, x);

       s.push(num);

   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter element to insert at bottom");
        int x=sc.nextInt();

        Stack<Integer> s=new Stack<Integer>();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        s.push(5);
        insert(s,x);
        System.out.println(s);

    }
}
