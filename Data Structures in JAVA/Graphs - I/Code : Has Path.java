/*
Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), check if there exists any path between them or not. Print true if the path exists and false otherwise.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex 'a' and 'b'.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
The first and only line of output contains true, if there is a path between v1 and v2 and false otherwise.
Constraints :
0 <= V <= 1000
0 <= E <= 1000
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= V - 1
0 <= v2 <= V - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
true
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
false
*/


import java.util.LinkedList; 
import java.util.Scanner;
import java.util.Queue; 
public class Solution{
    
	public static void printhelper(int edges[][],int v1,int v2,boolean visited[]){
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */

        Queue<Integer> q = new LinkedList<>();
        q.add(v1);
        int n=edges.length;
        while(q.size()!=0){
            int nekal=q.remove();
            visited[nekal]=true;
            if(nekal==v2){
                System.out.print("true");
                return;
            }
            for(int i=0;i<n;i++){
                if(edges[nekal][i]==1&&!visited[i]){
                    visited[i] =true;
                    q.add(i);
                }
            }
        }
        System.out.print("false");
     }
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
        int edges[][]=new int[n][n];
         
        for(int i=0;i<e;i++){
		
            
            
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        int v1 = s.nextInt();
		int v2= s.nextInt();
        boolean visited[]= new boolean[edges[0].length];
        printhelper(edges,v1,v2,visited);
	}

}

