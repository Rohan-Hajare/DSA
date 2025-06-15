package DSA.Queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueArrayImpl {

     int[] arr;
     int front;
     int size;
     int rear;


    QueueArrayImpl(int size)
    {
        arr=new int[size];
        this.size=size;
        this.front=0;
        this.rear=0;
    }

    void push(int data)
    {
        if(rear==size)
        {
            System.out.println("Queue is full");
        }
        else
        {
            arr[rear]=data;
            rear++;
        }
    }

    void pop()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
        }
        else {
            arr[front]=-1;
            front++;
            if(front==rear)
            {
                front=0;
                rear=0;
            }
        }
    }

    int front()
    {
        if(front==rear)
        {
            return -1;
        }
        else
        {
            return arr[front];
        }
    }

    void print()
    {
        for(int a=front;a<rear;a++)
        {
            System.out.print(arr[a]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        QueueArrayImpl q=new QueueArrayImpl(5);
        q.push(2);
        q.push(4);
        q.push(5);
        q.push(34);
        q.pop();

        q.print();
        System.out.println("Front= "+q.front());
        System.out.println(q.front);
        System.out.println(q.rear);

    }
}
