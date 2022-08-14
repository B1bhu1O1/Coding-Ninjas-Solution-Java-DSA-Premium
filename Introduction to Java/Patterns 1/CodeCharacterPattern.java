/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 13
Sample Input 1:
5
Sample Output 1:
A
BC
CDE
DEFG
EFGHI
Sample Input 2:
6
Sample Output 2:
A
BC
CDE
DEFG
EFGHI
FGHIJK
*/


import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int i,j;
   for(i=1; i<=n; i++)
   {
     int k=i;
     for(j=1; j<=i; j++,k++)
     {
       System.out.print((char) (k+64));
     }
     System.out.println("");
   }
   s.close();
	}

}
