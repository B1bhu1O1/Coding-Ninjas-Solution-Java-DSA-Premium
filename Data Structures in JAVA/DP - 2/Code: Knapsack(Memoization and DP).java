/*
A thief is robbing a store and can carry a maximal weight of W into his knapsack. There are N items and ith item weighs wi and is of value vi. Considering the constraints of maximum weight that knapsack can carry, you have to find and return the maximum value that thief can generate by stealing items.
Note
Space complexity should be O(W).
Input Format :
The first line contains an integers, that denote the value of N. The following line contains N space separated integers, that denote the values of weight of items. The following line contains N space separated integers, that denote the values associated with the items. The following line contains an integer that denote the value of W. W denotes maximum weight that thief can carry.
Output Format :
The first and only line of output contains the maximum value that thief can generate, as described in the task. 
Constraints
1 <= N <= 10^4
1<= wi <= 100
1 <= vi <= 100
Time Limit: 1 second
Sample Input 1 :
4
1 2 4 5
5 4 8 6
5
Sample Output 1 :
13
*/


public class Solution{
    static int knapsack(int[] weight, int[] value, int n, int maxWeight) {

            /* Your class should be named Solution
            * Don't write main().
            * Don't read input, it is passed as function argument.
            * Change in the given tree itself.
            * No need to return or print the output.
            * Taking input and printing output is handled automatically.
            */

         int storage[][]=new int[n+1][maxWeight+1];
         for(int i=0;i<n+1;i++){
             for(int j=0;j<maxWeight+1;j++){
                 storage[i][j]=-1;
             }
         }
         return knapsack(weight,value,maxWeight,n+1,storage,0);

    }
     public static int knapsack(int[] weight,int value[],int maxWeight,int n,int[][] storage,int i){
        if(i==weight.length || maxWeight==0){
            storage[i][maxWeight]=0;
            return storage[i][maxWeight];}

        if(storage[i][maxWeight]!=-1)
            return storage[i][maxWeight];
        if(weight[i]>maxWeight)
        {
            storage[i][maxWeight]=knapsack(weight,value,maxWeight,n-1,storage,i+1);
            return storage[i][maxWeight];
        }
        else{
            int op1=value[i]+knapsack(weight,value,maxWeight-weight[i],n-1,storage,i+1);
            int op2=knapsack(weight,value,maxWeight,n-1,storage,i+1);
            storage[i][maxWeight]=Math.max(op1,op2);
            return storage[i][maxWeight];
        }
         
    }
}

