/*
Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
This number can be huge, so, return output modulus 10^9 + 7.
Time complexity should be O(h).
Input Format :
The first and only line of input contains an integer, that denotes the value of h. Here, h is the height of the tree.
Output Format :
The first and only line of output contains the count of balanced binary trees modulus 10^9 + 7.
Constraints :
1 <= h <= 10^6
Time Limit: 1 sec
Sample Input 1:
3
Sample Output 1:
15
Sample Input 2:
4
Sample Output 2:
315
*/



public class Solution {

	public static int balancedBTs(int height){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */

         if(height == 0){
            return 1; 
        }
        int storage[] = new int[height + 1];
        storage[0] = storage[1] = 1;
        int mod = (int) Math.pow(10, 9) + 7; 
        for(int i = 2; i <= height; i++){
            
            long temp1 = (long) (storage[i- 1]) * storage[ i - 1];
            temp1 = temp1 % mod; 
           
            long temp2 = 2 * (long) (storage[i - 1]) * storage[ i - 2]; 
            temp2 = temp2 % mod;
            storage[i] = (int) (temp1 + temp2) % mod; 
        }
        return storage[height]; 
        
	}
}


