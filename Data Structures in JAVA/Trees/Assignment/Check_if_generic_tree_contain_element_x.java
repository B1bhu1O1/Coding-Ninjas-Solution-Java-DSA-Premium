/*
Given a generic tree and an integer x, check if x is present in the given tree or not. Return true if x is present, return false otherwise.
Input format :

Line 1 : Integer x

Line 2 : Elements in level order form separated by space (as per done in class). Order is -

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element

Output format : true or false

Sample Input 1 :
40
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 1 :
true
Sample Input 2 :
4
10 3 20 30 40 2 40 50 0 0 0 0 
Sample Output 2:
false
*/



public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here

        if(root == null)
			return false;
        
        //boolean found = false;
        if(root.data == x)
            return true;
        
        for(TreeNode<Integer> child : root.children){
             if(checkIfContainsX(child,x))
                 return true;
        }
        return false;
	}
	
}


