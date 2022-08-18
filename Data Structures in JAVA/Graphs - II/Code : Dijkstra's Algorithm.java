/*
Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges.
Find and print the shortest distance from the source vertex (i.e. Vertex 0) to all other vertices (including source vertex also) using Dijkstra's Algorithm.
Input Format :
Line 1: Two Integers V and E (separated by space)
Next E lines : Three integers ei, ej and wi, denoting that there exists an edge between vertex ei and vertex ej with weight wi (separated by space)
Output Format :
For each vertex, print its vertex number and its distance from source, in a separate line. The vertex number and its distance needs to be separated by a single space.
Note : Order of vertices in output doesn't matter.
Constraints :
2 <= V, E <= 10^5
Time Limit: 1 sec
Sample Input 1 :
4 4
0 1 3
0 3 5
1 2 1
2 3 8
Sample Output 1 :
0 0
1 3
2 4
3 5
*/


import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        
         int [][]  graph = new int [n][n];
        int t1,t2,cost;
        while(e>0)
        {
            e--;
            t1 = sc.nextInt();
            t2 = sc.nextInt();
            cost = sc.nextInt();
            graph[t1][t2] =  cost;
            graph[t2][t1] = cost;
        }
        int [] dis = new int [n];
        boolean [] visited = new boolean[n];
        for(int i=1;i<n;i++)
            dis[i] = Integer.MAX_VALUE;
    	int source=0;
        for(int i=0;i<n;i++)
        {
            source = findMinVertex(dis,visited);
            
            
            
            visited[source] =  true;
            for(int j=0;j<n;j++)
            {
                if(graph[source][j]>0 && visited[j]== false && dis[j] > dis[source]+graph[source][j])
                {
                    
                     dis[j] = dis[source]+graph[source][j];
                    
                }
            }
        }
        for(int i=0;i<n;i++)
        	System.out.println(i+" "+dis[i]);
		
	}
    public static int findMinVertex(int [] dis, boolean [] visited)
    {
     	int v, min_edge,n;
        min_edge = Integer.MAX_VALUE;
        n = dis.length;
        v=-1;
        for(int i=0;i<n;i++)
        {
            if(min_edge>dis[i] && visited[i]==false)
            {
                min_edge =  dis[i];
                v = i;
            }
        }
        return v;
	}
}





