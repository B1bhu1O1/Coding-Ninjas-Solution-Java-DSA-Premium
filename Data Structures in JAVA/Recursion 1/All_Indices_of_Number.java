/*
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
indexes where x is present in the array (separated by space)
Constraints :
1 <= N <= 10^3
Sample Input :
5
9 8 10 8 8
8
Sample Output :
1 3 4
*/



public class Solution {

	public static int[] allIndexes(int[] arr,int num) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
        return allIndexes(arr, 0, arr.length-1, num);
	}
	public static int[] allIndexes(int[] arr,int start,int end,int num) {
		if(start > end) {
			return new int[0];
		}
		
		int[] smallAns=allIndexes(arr, start+1, end, num);
		if(arr[start]==num) {
			int[] ans=new int[smallAns.length+1];
			ans[0]=start;
			for(int i=0;i<smallAns.length;i++)
				ans[i+1]=smallAns[i];
			return ans;
		}
		return  smallAns;
	
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,2,5,2,5,6,3,4,2,2};
		int[] ans=allIndexes(arr, 2);
		for(int i : ans) {
			System.out.print(i+" ");
		}
	}
	
}
