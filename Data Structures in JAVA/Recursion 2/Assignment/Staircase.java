/*
A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
Input format :
Integer N
Output Format :
Integer W
Constraints :
1 <= N <= 30
Sample Input 1 :
4
Sample Output 1 :
7
Sample Input 2 :
5
Sample Output 2 :
13
*/




public class Solution {
	
		
     public static int staircase(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
         
         if(n<0)
            return 0;
        if(n==0)
            return 1;
        int op1=staircase(n-1);
        int op2=staircase(n-2);
        int op3=staircase(n-3);
        return op1+op2+op3;

	}
	
}
