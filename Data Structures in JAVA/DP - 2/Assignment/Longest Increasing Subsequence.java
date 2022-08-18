/*
Given an array with N elements, you need to find the length of the longest subsequence in the given array such that all elements of the subsequence are sorted in strictly increasing order.
Input Format
The first line of input contains an integer N. The following line contains N space separated integers, that denote the value of elements of array.
Output Format
The first and only line of output contains the length of longest subsequence.
Constraints
1 <= N <= 10^3
Time Limit: 1 second
Sample Input 1 :
6
5 4 11 1 16 8
Sample Output 1 :
3
Sample Output Explanation
Length of longest subsequence is 3 i.e. (5,11,16) or (4,11,16).
Sample Input 2 :
3
1 2 2
Sample Output 2 :
2
*/


public class Solution {

    public static int lis(int arr[]) {
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */

         if(arr.length==0)
            return 1;
        int storage[]=new int[arr.length];
        storage[0]=1;

        for(int i=1;i<storage.length;i++){

            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i] && storage[i]<storage[j]+1)
                    storage[i]=storage[j]+1;
               else
                   storage[i]=Math.max(1,storage[i]);
        }}
        int max=storage[0];
        for(int i=1;i<storage.length;i++){
            if(storage[i]>max)
                max=storage[i];
        }
        return max;
        
    }
}


