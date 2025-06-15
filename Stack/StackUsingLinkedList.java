package DSA.Stack;
import java.util.Arrays;
public class StackUsingLinkedList {
    static stack top=null;


    static class stack
    {
        int data;
        stack next;

        stack(int data)
        {
            this.data=data;
            this.next=null;
        }


    }

    void push(int d)
    {
        stack newNode=new stack(d);
        newNode.next=top;
        top=newNode;

    }

    void pop()
    {
       if(top==null)
       {
           System.out.println("Stack is empty....!");
       }
       else
       {
           stack temp=top;
           top=temp.next;
           temp.next=null;
       }
       System.gc();
    }

    void peek()
    {
        if(isEmpty())
        {
            System.out.println("Peek= "+null);
        }
        else {
            System.out.println("Peek =" + top.data);
        }
    }
    void print()
    {
        stack temp=top;
        if(isEmpty())
        {
            System.out.println("Stack Underflow......!");
        }
        else {
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

    }

     boolean isEmpty()
     {
         return top == null;

     }
    public static void main(String[] args)
    {
        StackUsingLinkedList sl = new StackUsingLinkedList();
          sl.push(2);
          sl.push(3);
          sl.push(4);
          sl.push(7);
          sl.push(5);
          sl.push(34);
          sl.print();
          sl.peek();
        System.out.println("after poping 1 element ");
        sl.pop();
        sl.print();
        sl.peek();
        System.out.println("Is stack empty="+sl.isEmpty());
        System.out.println("after poping 2  element ");
        sl.pop();
        sl.pop();


        sl.print();
        sl.peek();
        System.out.println("Is stack empty="+sl.isEmpty());



     }
}
