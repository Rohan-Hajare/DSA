package DSA.Stack;

import java.util.Stack;

public class DeleteMiddleElement {
  static  void deleteMiddle(Stack<Integer> s,int size,int count)
    {
        if(count==size/2)
        {
            s.pop();
            return;
        }
        int num=s.peek();
        s.pop();

        //recursion call
        deleteMiddle(s,size,count+1);

        s.push(num);
    }
    public static void main(String[] args) {
      int count=0;
       Stack<Integer> s=new Stack<Integer>();
       s.push(3);
       s.push(2);
       s.push(4);
       s.push(1);
       s.push(5);
        System.out.println("Before removing middle element");
        System.out.println(s);
        deleteMiddle(s,s.size(),count);
        System.out.println("After removing middle element");
        System.out.println(s);
    }
}
