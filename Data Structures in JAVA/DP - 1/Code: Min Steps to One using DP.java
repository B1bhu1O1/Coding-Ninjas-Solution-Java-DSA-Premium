/*
Given a positive integer 'n', find and return the minimum number of steps that 'n' has to take to get reduced to 1. You can perform any one of the following 3 steps:
1.) Subtract 1 from it. (n = n - ­1) ,
2.) If n is divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
3.) If n is divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).  
Input format :
The first and the only line of input contains an integer value, 'n'.
Output format :
Print the minimum number of steps.
Constraints :
1 <= n <= 10 ^ 6
Time Limit: 1 sec
Sample Input 1 :
4
Sample Output 1 :
2 
Explanation of Sample Output 1 :
For n = 4
Step 1 :  n = 4 / 2  = 2
Step 2 : n = 2 / 2  =  1 
Sample Input 2 :
7
Sample Output 2 :
3
Explanation of Sample Output 2 :
For n = 7
Step 1 :  n = 7 ­- 1 = 6
Step 2 : n = 6  / 3 = 2 
Step 3 : n = 2 / 2 = 1  
*/


public class Solution {

	public static int countMinStepsToOne(int n) {
		//Your code goes here
        
        int steps[] = new int[n + 1]; 
        for(int i = 2; i <= n; i++){
            int count1,count2 = Integer.MAX_VALUE, count3 = Integer.MAX_VALUE; 
            count1 = steps[i - 1]; 
            // count1 is the steps of back element
            if(i % 2 == 0){
                count2 = steps[i / 2]; 
            }
            if(i % 3 == 0){
                count3 = steps[i / 3]; 
            }
            steps[i] = 1 + Math.min(count1, Math.min(count2, count3)); 
        }
        return steps[n]; 
        
	}

}

