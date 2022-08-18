/* Given a a binary tree. Replace each of it's data with the depth of tree.
Root is at depth 0, change its value to 0 and next level nodes are at depth 1 and so on.
Print the tree after modifying in inorder fashion.
Example:
Input

Alt text

Output

Alt text

Input format :
Line 1 :  Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
 Inorder traversal of modified tree.
Sample Input 1:
     1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
Sample Output 1:
     2 
     1
     2
     0 
     2 
     1
     2 */

/*class BinaryTreeNode<T> {
 public T data;
 public BinaryTreeNode<T> left;
 public BinaryTreeNode<T> right;

 public BinaryTreeNode(T data) {
 this.data = data;
 left=null;
 right=null;
 }*/

public class ReplaceNodeWithDepth {

    static void replaceDepth(BinaryTreeNode<Integer> n1) {
        setDepth(n1, 0);
        printBinary(n1);
    }

    private static void setDepth(BinaryTreeNode<Integer> n1, int depth) {
        if (n1 == null)
            return;
        n1.data = depth;
        setDepth(n1.left, depth + 1);
        setDepth(n1.right, depth + 1);
    }

    private static void printBinary(BinaryTreeNode<Integer> n1) {
        if (n1 == null)
            return;
        printBinary(n1.left);
        System.out.println(n1.data);
        printBinary(n1.right);
    }
}

