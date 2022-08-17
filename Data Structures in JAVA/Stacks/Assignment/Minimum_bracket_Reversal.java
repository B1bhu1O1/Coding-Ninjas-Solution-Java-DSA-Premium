/*
For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.
If the expression can't be balanced, return -1.
Example:
Expression: {{{{
If we reverse the second and the fourth opening brackets, the whole expression will get balanced. Since we have to reverse two brackets to make the expression balanced, the expected output will be 2.

Expression: {{{
In this example, even if we reverse the last opening bracket, we would be left with the first opening bracket and hence will not be able to make the expression balanced and the output will be -1.
Input Format :
The first and the only line of input contains a string expression, without any spaces in between.
Output Format :
The only line of output will print the number of reversals required to balance the whole expression. Prints -1, otherwise.
Note:
You don't have to print anything. It has already been taken care of.
Constraints:
0 <= N <= 10^6
Where N is the length of the expression.

Time Limit: 1sec
Sample Input 1:
{{{
Sample Output 1:
-1
Sample Input 2:
{{{{}}
Sample Output 2:
1
*/


import java.util.Stack;
public class Solution {

	public static int countBracketReversals(String input) {
		//Your code goes here
        
        if(input.length()%2!=0)
            return -1;
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='{')
            {
                stk.push('{');
            }
            else if(input.charAt(i)=='}')
            {
                if(stk.isEmpty() || stk.peek()=='}')
                {
                    stk.push('}');
                }
                else if(stk.peek()=='{')
                {
                    stk.pop();
                }

            }}
            int count=0;
            while(stk.size()!=0){
                char c1=stk.pop();
                char c2=stk.pop(); 

                if(c1==c2)
                {
                    if(c2=='{')
                        c2='}';
                    if(c1=='}')
                        c1='{';
                    count++;
                }

                else{
                    c1='{';
                    c2='}';
                    count++;
                    count++;
                }}
            return count;
	}

}


