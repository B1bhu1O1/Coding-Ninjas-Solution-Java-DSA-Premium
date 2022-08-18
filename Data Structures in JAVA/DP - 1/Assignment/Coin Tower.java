/*
Whis and Beerus are playing a new game today. They form a tower of N coins and make a move in alternate turns. Beerus plays first. In one step, the player can remove either 1, X, or Y coins from the tower. The person to make the last move wins the game. Can you find out who wins the game?
 Input format :
The first and the only line of input contains three integer values separated by a single space. They denote the value of N, X and Y, respectively.
Output format :
Prints the name of the winner, either 'Whis' or 'Beerus' (Without the quotes).
Constraints :
1 <= N <= 10 ^ 6
2 <= X <= Y<= 50

Time Limit: 1 sec
Sample Input 1 :
4 2 3
Sample Output 1 :
Whis
Sample Input 2 :
10 2 4
Sample Output 2 :
Beerus
Explanation to Sample Input 1:
Initially, there are 4 coins,  In the first move, Beerus can remove either 1, 2, or 3 coins in all three cases, Whis can win by removing all the remaining coins. 
*/


public class Solution {

	public static String findWinner(int n, int x, int y) {
		//Your code goes here
        
         int[] dp = new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
    
        for (int i=2;i<=n;i++)
        {
           
            if (dp[i-1]==0)
            {
                dp[i]=1;
            }
            else if ((i-x)>=0 && dp[i-x]==0)
            {
                dp[i]=1;
            }
            else if ((i-y)>=0 && dp[i-y]==0)
            {
                dp[i]=1;
            }
            else
            {
                dp[i]=0;
            }
           
        }
        
        if (dp[n]==1)
            return "Beerus";
        else
            return "Whis";
        
	}

}

