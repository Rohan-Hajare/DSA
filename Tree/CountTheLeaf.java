package DSA.Tree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CountTheLeaf {
    static Scanner sc=new Scanner(System.in);
  static int cnt=0;
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }

    }
    static Node BuildTree(Node root)
    {
        System.out.println("Enter the data: ");
        int data= sc.nextInt();
        root=new Node(data);
        if(data==-1)
        {
            return null;
        }
        System.out.println("Enter the data to left of "+data+" ");
        root.left = BuildTree(root.left);
        System.out.println("Enter the data to right of "+data+" ");
        root.right = BuildTree(root.right);
        return root;


    }
     static void inOrder(Node root)
     {
         if(root==null)
         {
             return;
         }
         inOrder(root.left);
         if(root.left==null && root.right==null)
         {
             cnt++;
         }
         inOrder(root.right);

     }

    public static void main(String[] args) {
       Node root =null;

        root=BuildTree(root);
        //1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1
        inOrder(root);
        System.out.println("The total leaf in a tree are: "+cnt);
    }
}
