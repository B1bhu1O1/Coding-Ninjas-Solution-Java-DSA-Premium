/*
Given an integer array of size N. Sort this array (in decreasing order) using heap sort.
Note: Space complexity should be O(1).
Input Format:
The first line of input contains an integer, that denotes the value of the size of the array or N.
The following line contains N space separated integers, that denote the value of the elements of the array.
Output Format :
The first and only line of output contains array elements after sorting. The elements of the array in the output are separated by single space.
Constraints :
1 <= n <= 10^6
Time Limit: 1 sec
Sample Input 1:
6 
2 6 8 5 4 3
Sample Output 1:
8 6 5 4 3 2
*/


public class Solution {

	public static void inplaceHeapSort(int arr[]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Change in the given input itself.
		* Taking input and printing output is handled automatically.
		*/
		
        //Find length of arr
		int n=arr.length;
		//Step 1 - Build heap using optimized method with time complexity O(n)
		for(int i=(n/2)-1;i>=0;i--)
		{
			//Perform down-heapfiy operation for node at index i, starting at index i and going to down to the last node (end of arr)
			downHeapify(arr,i,n);
		}
		
		//Step 2 - Perform remove minimum element, put them at respective last position in the heap and heap re-balancing until all the elements are out of the heap
		for(int i=n-1;i>=0;i--)
		{
			int temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			
			//Apply down-heapify from index 0 to index i
			downHeapify(arr,0,i);
		}
	}
    
    //Down-heapify for min. heap order property
	private static void downHeapify(int[] arr, int i, int n)
	{
		int parentIndex=i;
		int leftChildIndex=2*parentIndex+1, rightChildIndex=2*parentIndex+2;
		
		while(leftChildIndex<n)
		{
			int minIndex=parentIndex;
			if(arr[minIndex]>arr[leftChildIndex])
				minIndex=leftChildIndex;
			
			if(rightChildIndex<n && arr[minIndex]>arr[rightChildIndex])
				minIndex=rightChildIndex;
			
			if(minIndex==parentIndex)
				return;
			
			int temp=arr[parentIndex];
			arr[parentIndex]=arr[minIndex];
			arr[minIndex]=temp;
			
			parentIndex=minIndex;
			leftChildIndex=2*parentIndex+1;
			rightChildIndex=2*parentIndex+2;
			
		}
	}
	}


