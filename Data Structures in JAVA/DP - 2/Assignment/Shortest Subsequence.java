/*
Gary has two string S and V. Now, Gary wants to know the length shortest subsequence in S, which is not a subsequence in V.
Note: The input data will be such that there will always be a solution.
Input Format :
The first line of input contains a string, that denotes the value of S. The following line contains a string, that denotes the value of V.
Output Format :
Length of shortest subsequence in S such that it is not a subsequence in V
Constraints:
1 <= |S| <= 1000 (|x| implies the length of the string x)
1 <= |V| <= 1000 
Time Limit: 1 second
Sample Input 1:
babab
babba
Sample Output 1:
3
Explanation:
"aab" is the shortest subsequence which is present in S and absent in V.
*/


public class Solution {

	public int solve(String S,String V){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		
       int  m = S.length();
		int n = V.length();
		int[][] storage = new int[m+1][n+1];
        
        for(int i=0;i<=n;i++) {
			storage[0][i] = Integer.MAX_VALUE; 
		}
        
        for(int i=0;i<=m;i++) {
			storage[i][0] = 1;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {

				int k = Integer.MAX_VALUE;
                
                for(int l=j-1;l>=0;l--) {
					if( S.charAt(m-i) == V.charAt(l)) {
						k = l;
						break;
					}
				}
				if(k==Integer.MAX_VALUE) {
					storage[i][j] = 1;
					continue;
				}
				int count1 = storage[i-1][j];
				int count2 = Integer.MAX_VALUE;
				count2 = storage[i-1][k];
				if(count2!=Integer.MAX_VALUE) {
					count2++;
				}
				storage[i][j] = Math.min(count1, count2);

			}
		}
		return storage[m][n];

        
	}
	
}

