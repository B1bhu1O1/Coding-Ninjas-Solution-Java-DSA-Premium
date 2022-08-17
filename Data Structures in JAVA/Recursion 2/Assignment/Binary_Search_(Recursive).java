/*
Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.
Input format :

Line 1 : Array size

Line 2 : Array elements (separated by space)

Line 3 : x (element to be searched)

Sample Input :
6
2 3 4 5 6 8 
5 
Sample Output:
3 
*/


public class solution {

	// element - number to be searched
	public static int binarySearch(int input[], int element) {
		// Write your code here

        return helper(input,element,0,input.length-1);
    }
    private static int helper(int input[],int element,int si,int ei)
    { 
        if(si>ei)
            return -1;

        int mid=(si+ei)/2 ;
        if(element==input[mid])
            return mid;
        else if(element<input[mid])
            return helper(input,element,si,mid-1);
        else         
            return helper(input,element,mid+1,ei);
	}
}
