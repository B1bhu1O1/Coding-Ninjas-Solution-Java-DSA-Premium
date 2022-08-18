/*
Gary has a board of size NxM. Each cell in the board is a coloured dot. There exist only 26 colours denoted by uppercase Latin characters (i.e. A,B,...,Z). Now Gary is getting bored and wants to play a game. The key of this game is to find a cycle that contain dots of same colour. Formally, we call a sequence of dots d1, d2, ..., dk a cycle if and only if it meets the following condition:
1. These k dots are different: if i ≠ j then di is different from dj.
2. k is at least 4.
3. All dots belong to the same colour.
4. For all 1 ≤ i ≤ k - 1: di and di + 1 are adjacent. Also, dk and d1 should also be adjacent. Cells x and y are called adjacent if they share an edge.
Since Gary is colour blind, he wants your help. Your task is to determine if there exists a cycle on the board.
Input Format :
The first line of input contains two space separated integers N and M, where N is number of rows and M is the number of columns of the board. 
Each of the following N lines contain M characters. Please note that characters are not space separated. Each character is an uppercase Latin letter.
Output Format :
Print true if there is a cycle in the board, else print false.
Constraints :
2 <= N <= 1000
2 <= M <= 1000
Time Limit: 1 second
Sample Input 1:
3 4
AAAA
ABCA
AAAA
Sample Output 1:
true
*/


import java.util.*;

public class Solution {

    int solve(String[] board , int n, int m)
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        
        boolean[][] visited = new boolean[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(!visited[i][j]) {
					if(hasCycle(board,-1,-1,i,j,visited)==1) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
    public static int hasCycle(String[] board, int fromX, int fromY, int i, int j, boolean[][] visited) {
		
		if(visited[i][j]) {
			return 1;
		}
		
		int[] X_dir = {1,0,0,-1};
		int[] Y_dir = {0,1,-1,0};
		visited[i][j] = true;
		for(int l=0;l<X_dir.length;l++) {
			int x = X_dir[l] + i;
			int y = Y_dir[l] + j;
			if( x==fromX && y == fromY ) {
					continue;
			}
				
			if( x>=0 && y>=0 && x<board.length && y<board[x].length() && board[x].charAt(y) == board[i].charAt(j) ) {
				
				
				int ans = hasCycle(board, i, j, x, y, visited);
				if(ans == 1) {
					return 1;
				}
				
			}
			
		}
		return 0;
        
	}
	
	
}


