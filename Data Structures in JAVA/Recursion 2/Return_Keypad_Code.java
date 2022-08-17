/*
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/


public class solution {

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here

        if(n==0||n==1)
    {
        String ans[]={""};
        return ans;
    }
        int newN=n%10;
        String[] ans=keypad(n/10);
        String helpans=helper(newN);
        String finalans[]=new String[helpans.length()*ans.length];
        int k=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<helpans.length();j++){
            finalans[k]=ans[i]+helpans.charAt(j);
            k++;}
       }
        return finalans;
    }

    private static String helper(int newN){
        if(newN==2)
            return "abc";
        if(newN==3)
            return "def";
        if(newN==4)
            return "ghi";
        if(newN==5)
            return "jkl";
        if(newN==6)
            return "mno";
        if(newN==7)
            return "pqrs";
        if(newN==8)
            return "tuv";
        if(newN==9)
            return "wxyz";
        else
            return "";

	}
	
}
