/* Given a binary tree, find and return the sum of all nodes.
Input format :

Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.

Sample Input :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output :
35 */



public class SumOfNodes {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    public static int sum(BinaryTreeNode<Integer> root) {

        // Write your code herei
        if (root == null)
            return 0;
        int smallSum = sum(root.left) + sum(root.right);
        return smallSum + root.data;
    }
}

