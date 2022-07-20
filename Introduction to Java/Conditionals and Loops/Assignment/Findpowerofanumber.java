/*
Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
Note : For this question, you can assume that 0 raised to the power of 0 is 1


Input format :
Two integers x and n (separated by space)
Output Format :
x^n (i.e. x raise to the power n)
Constraints:
0 <= x <= 8 
0 <= n <= 9
Sample Input 1 :
 3 4
Sample Output 1 :
81
Sample Input 2 :
 2 5
Sample Output 2 :
32
*/


import java.util.Scanner;
public class Solution {
    
    static int pow(int base, int expo)
  {
    int pow=1;
    for(int i=1; i<=expo; i++)
    pow=pow*base;
    return pow;
  }

    public static void main(String[] args) {
        // Write your code here
        
         int base, expo;
   Scanner sc=new Scanner(System.in);
   base=sc.nextInt();
   expo=sc.nextInt();
   int po=pow(base,expo);
   System.out.println(po);
    }
}
