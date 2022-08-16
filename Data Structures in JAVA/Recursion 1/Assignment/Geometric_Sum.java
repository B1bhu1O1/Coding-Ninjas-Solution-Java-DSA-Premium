/*
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion.
Input format :
Integer k
Output format :
Geometric sum (upto 5 decimal places)
Constraints :
0 <= k <= 1000
Sample Input 1 :
3
Sample Output 1 :
1.87500
Sample Input 2 :
4
Sample Output 2 :
1.93750
Explanation for Sample Input 1:
1+ 1/(2^1) + 1/(2^2) + 1/(2^3) = 1.87500
*/



public class solution {

	public static double findGeometricSum(int n){
		// Write your code here

        if(n==0) {
			return 1;
		}
		return 1/Math.pow(2, n) + findGeometricSum(n-1);
		
	}
	public static void main(String[] args) {
		int n=3;
		System.out.println(findGeometricSum(n));
	}
}
