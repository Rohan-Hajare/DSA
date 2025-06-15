package DSA.Queue;

public class CircularQueue {

    int arr[];
    int front;
    int rear;
    int size;

    CircularQueue(int size)
    {
        this.size=size;
        this.arr=new int[size];
        this.front=this.rear=-1;

    }

    void enqueue(int data)
    {
        if(front==0 && rear==size-1 || rear==(front-1)%(size-1)
//        rear==(front-1)
        )//to check queue is full
        {
            System.out.println("Queue is full");
            return;
        }

        else if(front ==-1)//when first element to push
        {
            front=rear=0;

        }
        else if(rear==size-1&& front!=0)//to maintain cyclical nature
        {
            rear=0;

        }
        else
        {
            rear++;
        }
        arr[rear]=data;
    }

    void dequeue()
    {
        if(front==-1)// to check queue is empty
        {
            System.out.println("Queue is empty");
            return;
        }
        arr[front]=0;
         if(front==rear)//when first element to pop
        {
            front=rear=-1;
        }
        else if(front==size-1) //to maintain cyclical nature
        {
            front=0;
        }
        else
         {
             front++;
         }

        System.gc();
    }

    void print()
    {
        for(int a=0;a<size;a++)
        {

            System.out.print(arr[(front+a)%size]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        CircularQueue cq=new CircularQueue(6);
        cq.enqueue(56);
        cq.enqueue(52);
        cq.enqueue(53);
        cq.enqueue(57);
        cq.enqueue(67);
        cq.enqueue(34);
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
//        cq.enqueue(32);
//        cq.enqueue(32);

        cq.print();

        System.out.println("front= "+cq.front);
        System.out.println("rear= "+cq.rear);

    }
}
