package DSA.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BinaryTree {
static Scanner sc=new Scanner(System.in);
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

    static void levelOrderTraversal(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node temp=q.peek();
            q.remove();
            if(temp==null)
            {
                System.out.println(" ");
                if(!q.isEmpty())
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(" "+temp.data+" ");


            if(temp.left!=null)
            {
                q.add(temp.left);
            }
            if(temp.right!=null)
            {
                q.add(temp.right);
            }
            }

        }

    }

    static Node buildTreeUsingLevelOrder(Node root)
    {
        Queue<Node> q = new LinkedList<>();

        System.out.println("Enter the data");
        int data=sc.nextInt();
        root=new Node(data);
        q.add(root);

        while(!q.isEmpty())
        {
            Node temp=q.peek();
            q.remove();

            System.out.println("Enter the data for left of "+temp.data);
            int leftData=sc.nextInt();
            if(leftData!=-1)
            {
                temp.left=new Node(leftData);
                q.add(temp.left);

            }
            System.out.println("Enter the data for right of "+temp.data);
            int rightData=sc.nextInt();
            if(rightData!=-1)
            {
                temp.right=new Node(rightData);
                q.add(temp.right);

            }
        }
        return root;
    }
    static void reverseLevelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        Stack<Node> stack = new Stack<>();

        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            stack.push(currentNode);

            // Enqueue the right child first, then the left child
            // so that the left child is processed first when popping from the stack
            if (currentNode == null) {
                // Add a null marker to the queue if more levels remain
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }
            else {
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
            }
        }

        // Pop all items from the stack to print in reverse level order
        while (!stack.isEmpty()) {
            Node currentNode = stack.pop();

            if (currentNode == null) {
                System.out.println(); // Print a new line when null is encountered
            } else {
                System.out.print(currentNode.data + " ");
            }
        }
    }

   static void inorderTraversal(Node root)
    {
        //base case
        if(root==null)
        {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data+" ");
        inorderTraversal(root.right);

    }

    static void preOrderTraversal(Node root)
    {
        if(root==null)
        {
            return;

        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    static void postOrderTraversal(Node root)
    {
        if(root==null)
        {
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        if(root.left!=null||root.right!=null)
        {
            return;
        }
        else {
            System.out.print(root.data + " ");
        }

    }



    public static void main(String[] args) {
        Node root=null;

        root=BuildTree(root);
        //1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
//        root=buildTreeUsingLevelOrder(root);
        //1 3 5 7 11 17 -1 -1 -1 -1 -1 -1 -1

        System.out.println("Level Order Traversal");
        levelOrderTraversal(root);
//        System.out.println("Reverse Level Order Traversal");
//        reverseLevelOrderTraversal(root);

//        System.out.println("Inorder  Traversal");
//        inorderTraversal(root);
//        System.out.println("\npreOrder  Traversal");
//        preOrderTraversal(root);
//        System.out.println("\npostOrder  Traversal");
//        postOrderTraversal(root);



    }
}
