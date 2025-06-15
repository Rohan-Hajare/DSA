package DSA.LinkedList;

public class SinglyLinkedList {
static Node head;
static Node tail;
//Node created
  static  class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next=null;
        }
    }

    //general method for adding a new node
    void addNode(int d)
    {
        Node newNode=new Node(d);
        if(head==null){
          head=newNode;
          tail=head;
        }
        else{
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
            tail=temp.next;
        }
    }


    void insertAtHead(int d)
    {
        Node temp=new Node(d);
        if (head == null) {
            // If the list is empty, head and tail are the same
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
    }

    void insertAtTail(int d)
    {
        Node temp=new Node(d);
        if (tail == null) {
            // If the list is empty, head and tail are the same
            head = temp;
            tail = temp;
        } else {
            tail.next = temp; // Add the new node after tail
            tail = temp;      // Update tail to the new node
        }
    }

    void insertAtPosition(int position,int d)
    {
        //insert at start position
        if(position==1)
        {
            insertAtHead(d);
            return;
        }

        Node temp=head;
        int cnt=1;
        while(cnt<position-1)
        {
            temp=temp.next;
            cnt++;
        }
         //insert at end position
        if(temp.next==null)
        {
            insertAtTail(d);
            return;
        }
        Node nodeToInsert=new Node(d);

        nodeToInsert.next=temp.next;
        temp.next=nodeToInsert;
    }


    void deleteNodeByPosition(int position)
    {
        if(position==1)
        {
            Node temp=head;
            head=head.next;
            temp.next=null;
            System.gc();
        }
        else
        {
            Node prev=null;
            Node curr=head;
            int cnt=1;
            while(cnt<position && curr != null)
            {
                prev=curr;
                curr=curr.next;
                cnt++;
            }
            if (curr == null) {
                System.out.println("Position out of bounds.");
                return;
            }
              if(curr.next==null)
              {
                  prev.next =null;
                  tail=prev;

              }
              else {
                  prev.next = curr.next;
                  curr.next = null;
                  System.gc();
              }
        }
        System.gc();
    }

    void deleteNodeByData(int data)
    {
        if(data== head.data)
        {
            Node temp=head;
            head=head.next;
            temp.next=null;
            System.gc();
        }
        else
        {
            Node prev=null;
            Node temp=head;
            while(temp.next!=null)
            {

                if(data==temp.data)
                {
                    prev.next=temp.next;
                    temp.next=null;
                    System.gc();
                }
                else
                {
                    prev=temp;
                    temp=temp.next;
                }
            }
        }
    }

    //display
    void display()
    {
        Node current=head;

        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }

    }
    public static void main(String[] args) {

        SinglyLinkedList sll=new SinglyLinkedList();


//        SinglyLinkedList.Node n1=sll.new Node(1);
//        System.out.println(n1.data);
//        Node head=n1;
         sll.addNode(2);
         sll.addNode(1);


         sll.insertAtHead(10);
         sll.insertAtHead(4);

         sll.insertAtTail(5);
         sll.insertAtTail(3);
         sll.insertAtPosition(4,4);
         sll.insertAtPosition(1,0);
         sll.deleteNodeByPosition(1);
         sll.deleteNodeByPosition(4);
         sll.deleteNodeByData(2);
         sll.deleteNodeByPosition(5);
         sll.display();

        System.out.println("\nhead= "+head.data);
        System.out.println("tail= "+tail.data);
    }
}
