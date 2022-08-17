/*
Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :

Line 1 : Size of array

Line 2 : Array elements (separated by space)

Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 
*/


public class solution {

	// Return a 2D array that contains all the subsets
	public static int[][] subsets(int input[]) {
		// Write your code here

        return subsets(input,0);
    }
    public static int[][] subsets(int input[],int si) {
        if(si>=input.length)
        {
            int ans[][]=new int[1][0];
            return ans;
        }
        int[][] smallans=subsets(input,si+1);
        int[][] ans=new int[smallans.length*2][];
        int k=0;
        for(int i=0;i<smallans.length;i++){
            ans[i]=new int[smallans[i].length];
            for(int j=0;j<smallans[i].length;j++){
                ans[i][j]=smallans[i][j];
            }
            k++;
        }
        for(int i=0;i<smallans.length;i++)
        { ans[k+i]=new int[smallans[i].length+1];
          ans[k+i][0]=input[si];
            for(int j=1;j<=smallans[i].length;j++)
            {
                ans[i+k][j]=smallans[i][j-1];
            } 
       
        }
        return ans;
	}
}
