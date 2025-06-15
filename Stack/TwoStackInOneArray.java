package DSA.Stack;

public class TwoStackInOneArray {
    int size;
    int top1,top2;
    int[] arr;

    TwoStackInOneArray(int size)
    {
        this.size = size;
        arr=new int[size];
        this.top1=-1;
        this.top2=size;
    }

    void push1(int element)
    {
        if(top2-top1>1)
        {
            top1++;
            arr[top1]=element;
        }
        else
        {
            System.out.println("stack overflow");
        }
    }

    void push2(int element)
    {
        if(top2-top1>1)
        {
            top2--;
            arr[top2]=element;
        }
        else
        {
            System.out.println("stack overflow");
        }
    }

    void pop1()
    {
        if(top1>=0)
            top1--;

        else
            System.out.println("Stack Underflow");
    }

    void pop2()
    {
        if(top2<size)
            top2++;
        else
            System.out.println("stack Underflow");
    }

    void peek1()
    {
        System.out.println("Peek1= "+top1);
    }
    void peek2()
    {
        System.out.println("Peek2= "+top2);
    }
    void print()
    {
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = size-1; i >=top2 ; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        TwoStackInOneArray s=new TwoStackInOneArray(5);
        s.push1(2);
        s.push1(9);
        s.push1(7);
        s.push2(3);
        s.push2(9);
        s.print();
        s.peek1();
        s.peek2();

    }
}
