/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****
Note : There are no spaces between the stars (*).
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
*
**
***
****
*****
Sample Input 2:
6
Sample Output 2:
*
**
***
****
*****
******
*/


import java.util.Scanner;
public class Solution {

     public static void printStar(int n)
  {
    int i,j;
    for(i=0; i<n; i++)
    {
      for(j=0; j<=i; j++)
      {
        System.out.print("*");
      }
      System.out.println();
    }
  }

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   printStar(n);
   s.close();
	}

}
