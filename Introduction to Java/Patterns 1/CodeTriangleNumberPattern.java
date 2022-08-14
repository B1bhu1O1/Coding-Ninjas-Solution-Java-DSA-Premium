/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
5
Sample Output 1:
1
22
333
4444
55555
Sample Input 2:
6
Sample Output 2:
1
22
333
4444
55555
666666
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
   int i=1;
   while(i<=n)
   {
     int j=1;
     int start=i;
     while(j<=i)
     {
       System.out.print(start);
       j++;
     }
     System.out.println();
     i++;
   }
		
	}

}
