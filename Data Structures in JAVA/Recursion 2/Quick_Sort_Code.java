/*
Sort an array A using Quick Sort.
Change in the input array itself. So no need to return or print anything.


Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
Constraints :
1 <= n <= 10^3
Sample Input 1 :
6 
2 6 8 5 4 3
Sample Output 1 :
2 3 4 5 6 8
Sample Input 2 :
5
1 5 2 7 3
Sample Output 2 :
1 2 3 5 7 
*/


/*
	To apply the method explained in the hint video, we have to add two more parameters in the function call. This can be done by calling a helper function from given function. The helper function can have three parameters: array, start index, end index.  
	
	Skeleton code to achieve this:
	public class Solution {
		public static void quickSort(int[] input, int startIndex, int endInedx) {
			// your code goes here
		}
	
		public static void quickSort(int[] input) {
			quickSort(input, 0, input.length - 1);
		}
	
	}
	
*/


public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
        
        int s = 0;
     int e = input.length-1;
		quickS(input,s,e);
	}
    
    public static void quickS(int[] input, int si, int ei)
    {	
        if(si>=ei)
        {
            return;
        }
        int pivotIndex = partition(input,si,ei);
        quickS(input,pivotIndex+1,ei);
        quickS(input,si,pivotIndex-1);
        
    }
    
    public static int partition(int a[],int si,int ei)
    {
        int pivotElement = a[si];
        int smallnumcount = 0;
        
        for(int i = si+1;i<=ei;i++)
        {
            if(a[i]<pivotElement)
            {
                smallnumcount++;
            }
        }
        int temp = a[si + smallnumcount];
        a[si+smallnumcount]= pivotElement;
        a[si]=temp;
        
        int i = si;
        int j  = ei;
        while(i<j)
        {
            if(a[i]<pivotElement)
            {
                i++;
            }
            else if(a[j]>= pivotElement)
            {
                j--;
            }
            else
            {
                temp = a[i];
                a[i]=a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return si + smallnumcount;
		
	}
	
}

