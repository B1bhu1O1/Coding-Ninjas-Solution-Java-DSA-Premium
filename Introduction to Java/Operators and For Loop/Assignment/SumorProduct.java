/*
Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).
If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
Input format :
Line 1 : Integer N
Line 2 : Choice C
Output Format :
 Sum or product according to user's choice
Constraints :
1 <= N <= 12
Sample Input 1 :
10
1
Sample Output 1 :
55
Sample Input 2 :
10
2
Sample Output 2 :
3628800
Sample Input 3 :
10
4
Sample Output 3 :
-1
*/


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here

    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int m=s.nextInt();
    if(m==1)
    {
      int sum=0;
      for(int i=1; i<=n; i++)
      {
        sum+=i;
      }
      System.out.println(sum);
    }
    else if(m==2)
    {
      int a=1;
      for(int i=1; i<=n; i++)
      {
       a*=i;
      }
      System.out.println(a);
    }
    else
    {
      System.out.println(-1);
    }
    s.close();
	}
}
