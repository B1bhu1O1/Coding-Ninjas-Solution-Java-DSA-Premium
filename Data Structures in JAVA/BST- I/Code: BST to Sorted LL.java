/*
Given a BST, convert it into a sorted linked list. You have to return the head of LL.
Input format:
The first and only line of input contains data of the nodes of the tree in level order form. The data of the nodes of the tree is separated by space. If any node does not have left or right child, take -1 in its place. Since -1 is used as an indication whether the left or right nodes exist, therefore, it will not be a part of the data of any node.   
Output Format:
The first and only line of output prints the elements of sorted linked list.
Constraints:
Time Limit: 1 second
Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
Sample Output 1:
2 5 6 7 8 10
*/



class PairLinkedList{
        LinkedListNode<Integer> head;
        LinkedListNode<Integer> tail;
    }

public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

         return helper(root).head;
		
	}
    
    private static PairLinkedList helper(BinaryTreeNode<Integer> root){
        if(root == null){
            PairLinkedList pair = new PairLinkedList();
            pair.head = null;
            pair.tail = null;
            return pair;
        }
        
        LinkedListNode<Integer> newHead = new LinkedListNode<Integer>(root.data);
        PairLinkedList leftTree = helper(root.left);//get left tree
        PairLinkedList rightTree = helper(root.right);//get right tree
        PairLinkedList pair = new PairLinkedList();
        
        /*attach left tree to root and root to right tree*/
        
        //if left is not null attach root to right and return
        if(leftTree.head != null){
            pair.head = leftTree.head;
            pair.tail = leftTree.tail;
            pair.tail.next = newHead;
            pair.tail = newHead;
            if(rightTree.head == null){//if right is null, return
                pair.tail.next = null;
                return pair;
            }
        }
        //attach right tree to root
        if(rightTree.head != null && leftTree.head != null){
            pair.tail.next = rightTree.head;
            pair.tail = rightTree.tail;
            return pair;
        }
        //if left is null just attach right to root and return
        if(rightTree.head != null && leftTree.head == null){
            pair.head = newHead;
            newHead.next = rightTree.head;
            pair.tail = rightTree.tail;
            return pair;
        }
        //if both are null, simply return the current node
        else{
            pair.head = newHead;
            pair.tail = newHead;
        }
        return pair;
        
	}
}




