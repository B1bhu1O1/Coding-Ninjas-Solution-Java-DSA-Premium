/*
Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), find and print the path from v1 to v2 (if exists). Print nothing if there is no path between v1 and v2.
Find the path using BFS and print the shortest path available.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1. 
2. E is the number of edges present in graph G.
3. Print the path in reverse order. That is, print v2 first, then intermediate vertices and v1 at last.
4. Save the input graph in Adjacency Matrix.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex a and b.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
Print the path from v1 to v2 in reverse order.
Constraints :
2 <= V <= 1000
1 <= E <= (V * (V - 1)) / 2
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= 2^31 - 1
0 <= v2 <= 2^31 - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
3 0 1
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :

*/


import java.util.*;
public class Solution {
	
	public static void main(String[] args) {
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        
        Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
        int graph [][] = new int [v][v];
        while(e>0)
        {
            e--;
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            graph[t1][t2] = 1;
            graph[t2][t1] = 1;
        }
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        getPathBFS(graph,start,end);
		
	}
    public static void getPathBFS(int [][]graph,  int start, int end)
    {
        int n = graph[0].length;
        ArrayList <Integer> q = new ArrayList<Integer>();
        HashMap <Integer, Integer> hm = new HashMap<Integer, Integer>();
        boolean [] visited = new boolean[n];
        q.add(start);
        visited[start]=true;
        boolean flg =false;
        while(q.isEmpty() == false)
        {
            int t = q.remove(0);
            if(t==end)
            {
                flg = true;
                break;
            } 
            for(int i=0;i<n;i++)
            {
                if(graph[t][i]==1 && visited[i] == false)
                {
                    q.add(i);
                    visited[i]=true;
                    hm.put(i,t);
                }
            }
        }
        if(flg == true)
        {
            int temp=end;
            while(temp!=start)
            {
                
                System.out.print(temp+" ");
                temp = hm.get(temp);
            }
            System.out.print(start+" ");
            
        }
        
	}
}



