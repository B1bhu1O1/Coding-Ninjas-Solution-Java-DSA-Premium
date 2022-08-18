/*
You are given a N*N maze with a rat placed at maze[0][0]. Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1]. Rat can move in any direc­tion ( left, right, up and down).
Value of every cell in the maze can either be 0 or 1. Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
Input Format
Line 1: Integer N
Next N Lines: Each line will contain ith row elements (separated by space)
Output Format :
The output line contains true if any path exists for the rat to reach its destination otherwise print false.
Sample Input 1 :
3
1 0 1
1 0 1
1 1 1
Sample Output 1 :
true
Sample Input 2 :
3
1 0 1
1 0 1
0 1 1
Sample Output 2 :
 false
 */



public class Solution {

	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 

        int n = maze.length;
        int path[][] = new int[n][n];
         return solveMaze(maze, 0, 0, path);
	}
       public static boolean solveMaze(int[][] maze, int i, int j, int[][] path) {

        if (i < 0 || i >= maze.length || j < 0 || j >= maze.length || maze[i][j] == 0 || path[i][j] == 1) {
            return false;
        }

        path[i][j] = 1;

        if (i == maze.length - 1 && j == maze.length - 1) {

            return true;
        }

           
        if (solveMaze(maze, i - 1, j, path)) {
            return true;
        }

        if (solveMaze(maze, i, j + 1, path)) {
            return true;
        }

        if (solveMaze(maze, i + 1, j, path)) {
            return true;
        }

        if (solveMaze(maze, i, j - 1, path)) {
            return true;
        }
        return false;
	}
}


