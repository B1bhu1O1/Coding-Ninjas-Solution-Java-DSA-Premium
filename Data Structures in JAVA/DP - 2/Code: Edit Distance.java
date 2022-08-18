/*
Given two strings s and t of lengths m and n respectively, find the edit distance between the strings.
Edit Distance
Edit Distance of two strings is minimum number of operations required to make one string equal to other. In order to do so you can perform any of the following three operations only :
1. Delete a character
2. Replace a character with another one
3. Insert a character
Note
Strings don't contain spaces
Input Format :
The first line of input contains a string, that denotes the value of s. The following line contains a string, that denotes the value of t.
Output Format :
The first and only line of output contains the edit distance value between the given strings.
Constraints :
1<= m,n <= 10
Time Limit: 1 second
Sample Input 1 :
abc
dc
Sample Output 1 :
2
*/


public class Solution {

	
	public static int editDistance(String s1, String s2){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */        

         int m=s1.length();
        int n=s2.length();
        
        int[][] dp = new int[m+1][n+1];
        
        for (int i=n;i>=0;i--)
            dp[m][i]=n-i;
        
        for (int i=m;i>=0;i--)
            dp[i][n]=m-i;
        
        for (int i=m-1;i>=0;i--)
        {
            for (int j=n-1;j>=0;j--)
            {
                if (s1.charAt(i)==s2.charAt(j))
                {
                    dp[i][j]=dp[i+1][j+1];
                }
                else
                {
                    int ans1=1+dp[i+1][j+1];
                    int ans2=1+dp[i][j+1];
                    int ans3=1+dp[i+1][j];
                    
                    dp[i][j]=Math.min(ans1,Math.min(ans2,ans3));
                }
            }
        }
        return dp[0][0];
	}

	
}


