/*
For a given postorder and inorder traversal of a Binary Tree of type integer stored in an array/list, create the binary tree using the given two arrays/lists. You just need to construct the tree and return the root.
Note:
Assume that the Binary Tree contains only unique elements. 
Input Format:
The first line of input contains an integer N denoting the size of the list/array. It can also be said that N is the total number of nodes the binary tree would have.

The second line of input contains N integers, all separated by a single space. It represents the Postorder-traversal of the binary tree.

The third line of input contains N integers, all separated by a single space. It represents the inorder-traversal of the binary tree.
Output Format:
The given input tree will be printed in a level order fashion where each level will be printed on a new line. 
Elements on every level will be printed in a linear fashion. A single space will separate them.
Constraints:
1 <= N <= 10^4
Where N is the total number of nodes in the binary tree.

Time Limit: 1 sec
Sample Input 1:
7
4 5 2 6 7 3 1 
4 2 5 1 6 3 7 
Sample Output 1:
1 
2 3 
4 5 6 7 
Sample Input 2:
6
2 9 3 6 10 5 
2 6 3 9 5 10 
Sample Output 2:
5 
6 10 
2 3 
9 
*/



/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		//Your code goes here
        
         BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder, 0 ,postOrder.length-1, 0, inOrder.length-1);
    	return root;
	}
    
    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int siPost, int eiPost, int siIn, int eiIn) {
		// TODO Auto-generated method stub
    	
    	//Base case - If number of elements in the post-order is 0
    	if (siPost>eiPost)
    	{
    		return null;
    	}
    	
    	//Defining the root node for current recursion
    	int rootData=postOrder[eiPost];
    	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
    	
    	//Finding root data's location in Inorder (Assuming root data exists in Inorder)
    	int rootIndex=-1;
    	for (int i=siIn;i<=eiIn;i++)
    	{
    		if (rootData==inOrder[i])
    		{
                rootIndex=i;
    			break;
    		}
    	}
    	    	
    	//Defining index limits for Left Subtree Inorder
    	int siInLeft=siIn;
    	int eiInLeft=rootIndex-1;
    	
    	//Defining the index limits for Left Subtree Preorder
    	int siPostLeft=siPost;
    	int leftSubTreeLength = eiInLeft - siInLeft + 1;
    	int eiPostLeft=(siPostLeft)+(leftSubTreeLength-1);
    	
    	//Defining index limits for Right Subtree Inorder
    	int siInRight=rootIndex+1;
    	int eiInRight=eiIn;
    	
    	//Defining index limits for Right Subtree Preorder
    	int siPostRight=eiPostLeft+1;
    	int eiPostRight=eiPost-1;
    	
        BinaryTreeNode<Integer> rightChild = buildTree(postOrder, inOrder, siPostRight, eiPostRight, siInRight, eiInRight);
    	BinaryTreeNode<Integer> leftChild = buildTree(postOrder, inOrder, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
    	
    	root.left=leftChild;
    	root.right=rightChild;
    	return root;
	}

}

