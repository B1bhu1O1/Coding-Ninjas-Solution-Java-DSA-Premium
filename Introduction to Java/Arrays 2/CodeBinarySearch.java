/*
You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X. Write a function to search this element in the given input array/list using 'Binary Search'. Return the index of the element in the input array/list. In case the element is not present in the array/list, then return -1.
Input format :
The first line contains an Integer 'N' which denotes the size of the array/list.

Second line contains 'N' single space separated integers representing the elements in the array/list.

Third line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow..

All the 't' lines henceforth, will take the value of X to be searched for in the array/list.
Output Format :
For each test case, print the index at which X is present, -1 otherwise.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^4
0 <= N <= 10^6
0 <= X <= 10^9
Time Limit: 1 sec
Sample Input 1:
7
1 3 7 9 11 12 45
1
3
Sample Output 1:
1
Sample Input 2:
7
1 2 3 4 5 6 7
2
9
7
Sample Output 2:
-1
6
*/



public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        
        int a = 0;
        int b = arr.length - 1;
        
        while(a<=b)
        {
            int mid = (a+b)/2;
            if(arr[mid]>x)
            {
                b = mid - 1;
            }
            else if (arr[mid]<x)
            {
                a = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }
    
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int tar = 4;
        System.out.println(binarySearch(arr,tar));
    }

}
