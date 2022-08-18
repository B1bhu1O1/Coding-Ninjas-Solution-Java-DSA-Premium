/*
Given an undirected, connected and weighted graph G(V, E) with V number of vertices (which are numbered from 0 to V-1) and E number of edges.
Find and print the Minimum Spanning Tree (MST) using Kruskal's algorithm.
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
Time Limit: 1 sec
Sample Input 1 :
4 4
0 1 3
0 3 5
1 2 1
2 3 8
Sample Output 1 :
1 2 1
0 1 3
0 3 5
*/


import java.util.Scanner;
import java.util.Arrays;

class Edge implements Comparable<Edge>{
    int source;
    int dest;
    int weight;

    public int compareTo(Edge o) {
        return this.weight - o.weight; 
    }

}

public class Solution {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int e = scanner.nextInt(); 
        
		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        
         Edge[] input = new Edge[e];
        for(int i=0;i<e;i++) {
            int sv = scanner.nextInt();
            int ev = scanner.nextInt();
            int weight = scanner.nextInt();
            Edge edge = new Edge(); 
            edge.source = sv;
            edge.dest = ev;
            edge.weight = weight;
            input[i] = edge;
        }
        Arrays.sort(input);
        kruskals(input,n);


    }
    public static void kruskals(Edge[] input, int n) {
		
		Edge[] output = new Edge[n-1]; 
		int[] parent = new int[n]; 
		for(int i=0;i<parent.length;i++) {
			parent[i] = i; 
		}
		int count =0;
		int i=0;
		while(count<n-1) {
			
			int parentSource = findParent(parent,input[i].source);
			int parentDest = findParent(parent,input[i].dest);
			
			if(parentDest == parentSource) {
				i++;
				continue;
			}
			output[count] = input[i];
			parent[parentSource] = parentDest; 
			count++;
			i++;
		}
		
		for(Edge edge : output) {
			if(edge.source < edge.dest)
			System.out.println( edge.source +" "+ edge.dest+" "+ edge.weight);
			else {
				System.out.println(edge.dest+" "+ edge.source+" " + edge.weight);
			}
			
			
		}
		
	}

	public static int findParent(int[] parent, int i) {
		if(parent[i] == i) {
			return i;
		}
		return findParent(parent, parent[i] );
	}
}




