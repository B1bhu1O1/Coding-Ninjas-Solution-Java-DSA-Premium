/*
Given a chain of matrices A1, A2, A3,.....An, you have to figure out the most efficient way to multiply these matrices. In other words, determine where to place parentheses to minimize the number of multiplications.
You will be given an array p[] of size n + 1. Dimension of matrix Ai is p[i - 1]*p[i]. You need to find minimum number of multiplications needed to multiply the chain.
Input Format:
The first line of input contains an integer, that denotes the value of n. The following line contains n+1 integers, that denote the value of elements of array p[].
Output Format:
The first and only line of output prints the minimum number of multiplication needed.
Constraints :
1 <= n <= 100
Time limit: 1 second
Sample Input 1:
3
10 15 20 25
Sample Output 1:
8000
Sample Output Explanation:
There are two ways to multiply the chain - A1*(A2*A3) or (A1*A2)*A3.
If we multiply in order- A1*(A2*A3), then number of multiplications required are 11250.
If we multiply in order- (A1*A2)*A3, then number of multiplications required are 8000.
Thus minimum number of multiplications required are 8000. 
*/


import java.util.Arrays;
public class Solution {

	
	public static int mcm(int[] p){
		
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	*/

        int  n = p.length;
        int[][] storage = new int[p.length][p.length];
        for(int i =n-1;i>=0;i--) {
            for(int j=0;j<n;j++) {
                if( i +1 < j ) {
                    int min = Integer.MAX_VALUE;
                    int minIndex = 0;
                    for(int k=i+1;k<j;k++) {
                        int c = storage[i][k] + storage[k][j] + p[i] * p[k] * p[j] ;
                        if(c < min) {
                            min = c;
                            minIndex = k;
                        }
                    }
                    storage[i][j] = min ;
                }
            }
        }
        return storage[0][n-1];
	}


	
}


