/*
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
Note:
The sizes N and M can be different. 

Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry. 

No need to print the elements of the output array/list.
Using the function "sumOfTwoArrays", write the solution to the problem and store the answer inside this output array/list. The main code will handle the printing of the output on its own.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the required sum of the arrays/list in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec 
Sample Input 1:
1
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0
Sample Input 2:
2
3
8 5 2
2
1 3
4
9 7 6 1
3
4 5 9
Sample Output 2:
0 8 6 5
1 0 2 2 0 
*/



public class Solution {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        
         int len1 = arr1.length;
        int len2 = arr2.length;
        int len3, small;
        int car = 0;
         if (len1<=len2){
            small = len1;
        }
        
        else{
            small = len2;
        }
        
        if (len1>=len2){
            len3 = len1;
        }else{
            len3 = len2;
        }
        
        len3++;
        for(int i= 0; i<small; i++){
            output[len3 - i - 1] = (arr1[len1-i-1] + arr2[len2-i-1] + car)%10;
            car = (arr1[len1-i-1] + arr2[len2-i-1] + car)/10;
        }
        
        
        if (len1>len2){
            for(int i = len2; i<len1; i++){
                output[len3-i-1] = (arr1[len1-i-1] + car)%10;
                car = arr1[len1-i-1]/10;
            }
            
        }
        
        else if(len2>len1){
            for(int i = len1; i<len2; i++){
                output[len3-i-1] = (arr2[len2-i-1] + car)%10;
                car = arr2[len2 - i -1]/10;
            }
        }
        
        output[0] += car;
    }

}
