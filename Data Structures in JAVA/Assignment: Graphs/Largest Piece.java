/*
It's Gary's birthday today and he has ordered his favourite square cake consisting of '0's and '1's . But Gary wants the biggest piece of '1's and no '0's . A piece of cake is defined as a part which consist of only '1's, and all '1's share an edge with each other on the cake. Given the size of cake N and the cake, can you find the count of '1's in the biggest piece of '1's for Gary ?
Input Format :
The first line of input contains an integer, that denotes the value of N. 
Each of the following N lines contain N space separated integers.
Output Format :
Print the count of '1's in the biggest piece of '1's, according to the description in the task.
Constraints :
1 <= N <= 1000
Time Limit: 1 sec
Sample Input 1:
2
1 1
0 1
Sample Output 1:
3
*/


public class Solution {

    static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public static int dfs(String[] edge, int n) {
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        
	    boolean[][] visited = new boolean[n][n];
		int max = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(!visited[i][j] && edge[i].charAt(j)=='1' ){
					int ans = max1s( edge,visited,i,j,n);
					if(max <ans){
						max = ans;
					}
				}
			}
		}
		return max;
	}
    public static int max1s(String[] edge,boolean[][] visited,int x,int y,int n){



 
		int[] X_dir = {0,1,-1,0}; 
		int[] Y_dir = {1,0,0,-1};
		int max = 0;
		visited[x][y] = true;
		for(int i=0;i<X_dir.length;i++){

			int a = X_dir[i] +x;
			int b = Y_dir[i] + y;

			if(a>=0 && b>=0 && a<n &&
					b<n && edge[a].charAt(b) =='1' 
					&& !visited[a][b] ){

				int ans = max1s(edge,visited, a,b,n);
				max = max + ans;

			}


		}
		return max + 1;


	}


}


