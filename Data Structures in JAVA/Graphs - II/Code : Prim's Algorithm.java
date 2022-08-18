/*
Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges.
Find and print the Minimum Spanning Tree (MST) using Prim's algorithm.
For printing MST follow the steps -
1. In one line, print an edge which is part of MST in the format - 
v1 v2 w
where, v1 and v2 are the vertices of the edge which is included in MST and whose weight is w. And v1  <= v2 i.e. print the smaller vertex first while printing an edge.
2. Print V-1 edges in above format in different lines.
Note : Order of different edges doesn't matter.
Input Format :
Line 1: Two Integers V and E (separated by space)
Next E lines : Three integers ei, ej and wi, denoting that there exists an edge between vertex ei and vertex ej with weight wi (separated by space)
Output Format :
Print the MST, as described in the task.
Constraints :
2 <= V, E <= 10^5
1 <= Wi <= 10^5
Time Limit: 1 sec
Sample Input 1 :
4 4
0 1 3
0 3 5
1 2 1
2 3 8
Sample Output 1 :
0 1 3
1 2 1
0 3 5
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
        
        int graph [][] = new int [n][n];
        int t1,t2,cost;
        int []weight= new int[n];
       	while(e>0)
        {
            e--;
            t1=sc.nextInt();
            t2=sc.nextInt();
            cost = sc.nextInt();
            graph[t1][t2] = cost;
            graph[t2][t1] = cost;
            
        }
        int [] parent = new int[n];
        for(int i=0;i<n;i++)
        {
            weight[i] = Integer.MAX_VALUE;
        }
        boolean [] visited = new boolean [n];
        parent[0] =-1;
        weight[0] =0;
        int source = 0;
        int count, min_edge;
        int next_source=0;
       	
        for(int i=1;i<n;i++)
        {
            source = findMinVertex(weight,visited);
            visited[source]=true;
            
            for(int j=0;j<n;j++)
            {
                if(graph[source][j]>0 && visited[j]==false && weight[j] > graph[source][j])
                {
                    weight[j] =  graph[source][j];
                    parent[j] = source;
                    
                                              
                }
            }
        }
        
        for(int i = 1;i<n;i++)
        {
            if(i< parent[i])
                System.out.println(i+" "+parent[i]+" "+weight[i]);
            else
                System.out.println(parent[i]+" "+i+" "+weight[i]);
                
        }
        
		
	}
    public static int findMinVertex(int []weight, boolean[] visited)
    {
        int v, min_edge,n;
        n=weight.length;
        v=0;
        min_edge =  Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(visited[i] == false && min_edge > weight[i])
            {
                v = i;
                min_edge = weight[i];
            }
        }
        return v;
	}
}



