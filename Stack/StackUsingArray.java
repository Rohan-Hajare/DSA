package DSA.Stack;

import java.util.Arrays;

public class StackUsingArray {
    int[] arr;
    int top;
    int size;

    StackUsingArray(int size)
    {
        this.size=size;
        arr=new int[size];
        this.top=-1;

    }

    void push(int element)
    {
        if(size-top>1)
        {
            top++;
          arr[top] = element;
        }
        else {
            System.out.println("Stack Overflow");
        }
    }
    void pop()
    {
        if(top>=0)
            top--;
        else
            System.out.println("Stack Underflow");

    }
    int peek()
    {
        if(top>=0)
            return arr[top];
        else
            return -1;
    }

    boolean isEmpty()
    {
        if(top>=0)
            return false;
        else
            return true;
    }

    void print()
    {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackUsingArray st=new StackUsingArray(5);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.print();
        System.out.println("Peek= "+st.peek());
        st.pop();
        System.out.println("After pop element");
        st.print();
        System.out.println("Peek= "+st.peek());

        st.print();
        System.out.println(st.isEmpty());
    }

}
