/*
Given an undirected graph G(V,E), check if the graph G is connected graph or not.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
Output Format :
The first and only line of output contains "true" if the given graph is connected or "false", otherwise.
Constraints :
0 <= V <= 1000
0 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
Time Limit: 1 second
Sample Input 1:
4 4
0 1
0 3
1 2
2 3
Sample Output 1:
true
Sample Input 2:
4 3
0 1
1 3 
0 3
Sample Output 2:
false 
Sample Output 2 Explanation
The graph is not connected, even though vertices 0,1 and 3 are connected to each other but there isn’t any path from vertices 0,1,3 to vertex 2. 
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
       
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][]=new int[V][V];
        if(V==0 && E==0)
        {
            System.out.println("true");
            return;
        }
           
        for(int i=0;i<E;i++){
            int sv=s.nextInt();
            int ev=s.nextInt();
            edges[sv][ev]=1;
            edges[ev][sv]=1;
        }
        boolean ans=isConnected(edges);
        System.out.println(ans);
    }
    public static boolean isConnected(int[][] edges){
        boolean[] visited=new boolean[edges.length];
        DFS(edges,0,visited);
        for(boolean elem:visited)
        {
            if(elem==false)
                return false;
        }
        return true;
    }
    public static void  DFS(int[][] edges,int startver,boolean[] visited){
        visited[startver]=true;
        for(int i=0;i<edges.length;i++){
            if(edges[startver][i]==1 && !visited[i]){
                visited[i]=true;
                DFS(edges,i,visited);

            }
        }
        return ;

	}

}


