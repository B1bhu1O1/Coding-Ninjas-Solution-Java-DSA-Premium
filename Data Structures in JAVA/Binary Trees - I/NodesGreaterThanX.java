/* Given a Binary Tree and an integer x, find and return the count of nodes which are having data greater than x.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Integer x
Output Format :
count
Sample Input :
8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
8
Sample Output :
3 */



public class NodesGreaterThanX {

    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
     * right;
     * 
     * public BinaryTreeNode(T data) { this.data = data; } }
     */

    public static int numNodesGreaterX(BinaryTreeNode<Integer> root, int x) {
        /*
         * Your class should be named Solution Don't write main(). Don't read input, it
         * is passed as function argument. Return output and don't print it. Taking
         * input and printing output is handled automatically.
         */
        if (root == null)
            return 0;

        if (root.data > x) {
            return 1 + numNodesGreaterX(root.left, x) + numNodesGreaterX(root.right, x);
        } else {
            return numNodesGreaterX(root.left, x) + numNodesGreaterX(root.right, x);
        }

    }

}

