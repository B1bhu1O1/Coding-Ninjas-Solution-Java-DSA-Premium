/*
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
Input Format :
Integer N
Output Format :
Prime numbers in different lines
Constraints :
1 <= N <= 100
Sample Input 1:
9
Sample Output 1:
2
3
5
7
Sample Input 2:
20
Sample Output 2:
2
3
5
7
11
13
17
19
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
    for(int i=2; i<=n; i++)
    {
      if(i!=2 && i%2==0)
      {
        continue;
      }
      else if(i!=3 && i%3==0)
      {
        continue;
      }
      else if(i!=5 && i%5==0)
      {
        continue;
      }
      else if(i!=7 && i%7==0)
      {
        continue;
      }
      else
      {
        System.out.println(i);
      }
    }
	}
}
