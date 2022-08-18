/*
Given an undirected and disconnected graph G(V, E), print its BFS traversal.
Note:
1. Here you need to consider that you need to print BFS path starting from vertex 0 only. 
2. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
3. E is the number of edges present in graph G.
4. Take graph input in the adjacency matrix.
5. Handle for Disconnected Graphs as well
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains space separated two integers, that denote that there exists an edge between vertex a and b.
Output Format :
Print the BFS Traversal, as described in the task.
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
0 1 3 2
*/


import java.util.Scanner;
import java.util.Queue;
import java.util.*;
public class Solution {

	public static void printHelper(int edges[][], int sv,boolean visited[]){
        
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        while(q.size()!=0){
            int firstelem = q.remove();
            System.out.print(firstelem+" ");
            visited[sv] = true;
            for(int i=0; i<edges[0].length; i++){
                if(edges[firstelem][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }       
            }
        }   
    }
    
    public static void print(int edges[][]){
        boolean visited[] = new boolean[edges.length];
        for(int i=0; i< edges.length; i++){
            if(!visited[i]){
                printHelper(edges, i, visited);   
            }
        }
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int V = s.nextInt();
		int E = s.nextInt();
        int edges[][] = new int[V][V];
        for(int i =0; i< E; i++){
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;   
            edges[sv][fv] =1;
        }
        print(edges);
	}

}

