/*
Assume that the value of a = 1, b = 2, c = 3, ... , z = 26. You are given a numeric string S. Write a program to print the list of all possible codes that can be generated from the given string.
Note : The order of codes are not important. Just print them in different lines.
Input format :
A numeric string S
Output Format :
All possible codes in different lines
Constraints :
1 <= Length of String S <= 10
Sample Input:
1123
Sample Output:
aabc
kbc
alc
aaw
kw
*/


public class solution {

	public static void printAllPossibleCodes(String input) {
		// Write your code here

        String output="";
       helper(input,output);
        return;

    }
    private static void helper(String input,String output){
        if(input.length()==0)
        {  System.out.println(output);
        return;
        }
        char ch1=helper1(input.charAt(0)-'0');
        helper(input.substring(1),output+ch1);
        if(input.length()>=2)
        {
            int ch2=input.charAt(0)-'0';
            int ch3=input.charAt(1)-'0';
            int x=ch2*10+ch3;
            if(x>=10 && x<=26)
            {
                char ch4=helper1(x);
            helper(input.substring(2),output+ch4);
                
        }
        
        
    }
        return;}
        private static char helper1(int ch){
            return (char)('a'+ch-1);
	}
}
