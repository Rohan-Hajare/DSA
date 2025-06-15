package DSA.Queue;

public class QueueLinkedListImpl {
    static Node front=null;
    static Node rear=null;
     static class Node
     {
         int data;
         Node next;

         Node(int d)
         {
             this.data = d;
             this.next=null;
         }
     }

     static void push(int d)
     {
         Node newNode=new Node(d);

         if(front==null && rear==null)
         {
             front=rear=newNode;
         }
         else
         {
             rear.next=newNode;
             rear=newNode;
         }
     }

     static void pop()
     {
         if(front==null && rear==null)
         {
             System.out.println("Queue is Underflow.....!");
             return;
         }
         else {
             if(front==rear)
             {
                 front=rear=null;
             }
             else {
                 Node temp = front;
                 front = temp.next;
                 temp.next = null;
                 System.gc();
             }
         }
     }

     static void display()
     {
         if(front==null && rear==null)
         {
             System.out.println("Queue is Underflow.....!");
             return;
         }
         else {
            Node temp=front;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
             System.out.println();
         }
     }
    public static void main(String[] args) {

         push(3);
         push(2);
         push(5);
         push(9);
         push(7);
         display();
        System.out.println("Front: "+front.data);
        System.out.println("Rear: "+rear.data);
        System.out.println("After poping....!");
        pop();

        display();

    }
}
