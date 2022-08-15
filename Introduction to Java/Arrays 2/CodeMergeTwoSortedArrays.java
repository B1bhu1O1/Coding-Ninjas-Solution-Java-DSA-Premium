/*
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec 
Sample Input 1 :
1
5
1 3 4 7 11
4
2 4 6 13
Sample Output 1 :
1 2 3 4 4 6 7 11 13 
Sample Input 2 :
2
3
10 100 500
7
4 7 9 25 30 300 450
4
7 45 89 90
0
Sample Output 2 :
4 7 9 10 25 30 100 300 450 500
7 45 89 90
*/



public class Solution {  

    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        
        int m = arr1.length;
        int n = arr2.length;
        
        int arr[] = new int[m+n];
        int i  = 0;
        int j  = 0;
        int k = 0;
        while(i<m && j<n)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k] = arr1[i];
                k++;
                i++;
            }
            else
            {
                arr[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<m)
        {
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<n)
        {
            arr[k]=arr2[j];
            j++;
            k++;
        }
        return arr;
    }
    
    public static void main(String args[])
    {
        int arr1[]= {1,2,3,4,5,6,7,8};
        int arr2[] = {2,3,6,8,9};
        merge(arr1,arr2);
    }

}
