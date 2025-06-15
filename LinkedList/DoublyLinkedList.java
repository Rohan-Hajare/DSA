package DSA.LinkedList;

public class DoublyLinkedList {
    static class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int d)
        {
          this.data=d;
        }

    }
    static Node head;
    static Node tail;

    void addNode(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            tail = newNode;

        }


    }

    void insertAtHead(int d)
    {
        if(head == null)
        {
            Node node = new Node(d);
            head = node;
            tail=node;
        }
        else {
            Node node = new Node(d);
            node.next = head;
            head.prev = node;
            head = node;
        }
    }

    void insertAtTail(int d)
    {
        if(tail == null)
        {
            Node node = new Node(d);
            tail = node;
            head = node;
        }
        else {
            Node node = new Node(d);
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    void insertAtPosition(int pos,int d)
    {
        Node node=new Node(d);
        if(pos==1)
        {
            insertAtHead(d);
            return;
        }
        Node temp=head;
        int cnt=1;
        while(cnt<pos-1)
        {
            temp=temp.next;
            cnt++;
        }
        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;
    }

    void deleteAtPosition(int pos)
    {
        Node temp=head;
        if(pos==1)
        {
            temp=head.next;
            head.next=null;
            temp.prev=null;
            head=temp;
        }
        else {
            Node curr = head;
            Node pre = null;

            int cnt = 1;
            while (cnt < pos) {
                pre = curr;
                curr = curr.next;
                cnt++;
            }
            if (curr == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            if(curr.next==null)
            {
                pre.next =null;
                curr.prev =null;
                tail=pre;

            }
            else {
                curr.prev = null;
                pre.next = curr.next;
                curr.next = null;
             }
        }
    }
    void print()
    {
        Node current=head;

        while(current!=null)
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    int getLength()
    {
        Node temp=head;
        int cnt=1;
        while(temp.next!=null)
        {
            cnt++;
            temp=temp.next;
        }
        return cnt;
    }


    public static void main(String[] args) {
 DoublyLinkedList d=new DoublyLinkedList();
//        Node node1= new Node(2);
//        head=node1;
//        tail=node1;

        d.addNode(45);
        d.print();

        d.addNode(9);
        d.print();

      d.insertAtHead(3);
        d.print();

      d.insertAtHead(14);
        d.print();

      d.insertAtTail(64);
        d.print();
        d.insertAtTail(59);
        d.print();

      d.insertAtPosition(3,1);
        d.print();

        d.deleteAtPosition(1);
        d.print();
        d.deleteAtPosition(4);
        d.print();

        d.deleteAtPosition(d.getLength());
        d.print();

        d.deleteAtPosition(d.getLength());
        d.print();


        System.out.println("\nhead= "+head.data);
        System.out.println("tail= "+tail.data);
        System.out.println(tail.next);
        System.out.println("Length= "+d.getLength());
    }
}
