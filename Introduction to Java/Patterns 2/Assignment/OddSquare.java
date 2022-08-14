/*
Write a program to print the pattern for the given N number of rows.
For N = 4
1357
3571
5713
7135
Input Format :
A single integer: N
Output Format :
Required Pattern
Constraints :
0 <= N <= 50
Sample Input 1 :
3
Sample Output 1 :
135
351
513
Sample Input 2 :
 5
Sample Output 2 :
13579
35791
57913
79135
91357
*/


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int i=1;
    while(i<=n)
    {
      int j=n;
      int odd=2*i-1;
      while(j>=i)
      {
        System.out.print(odd);
        odd=odd+2;
        j--;
      }
      int p=1;
        int k=1;
      while(k<=i-1)
      {
        System.out.print(p);
        p=p+2;
          k++;
      }
      System.out.println();
      i++;
    }
	}
}
