/*
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.
Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".
Input Format:
The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.
Output Format:
The only line of output prints the sentence(string) such that each word in the sentence is reversed. 
Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second
Sample Input 1:
Welcome to Coding Ninjas
Sample Output 1:
emocleW ot gnidoC sajniN
Sample Input 2:
Always indent your code
Sample Output 2:
syawlA tnedni ruoy edoc
*/



public class Solution {

	public static String reverseEachWord(String str) {
		//Your code goes here
        
        String rev = "";
        int start = 0;
        String finalans = "";
        int len = str.length();
        //int space = str.length();
        
        for(int i = 0; i<len; i++){
            if (str.charAt(i) == ' '){
                for(int j =start; j<i; j++){
                    rev = str.charAt(j) + rev;
                }
                
                start = i;
                	}
            
            else if (i==len-1){
                for(int j = start; j<len; j++){
                    rev = str.charAt(j) +rev;
                     }
            }
            
           
    			}
           int space = rev.length();
         for(int i = rev.length()-1; i>=0;i--){
            if (i==0){
                finalans = finalans+rev.substring(0,space);
            }
            
            else if(rev.charAt(i)== ' '){
                finalans = finalans+rev.substring(i+1,space)+" ";
                space = i;
            }
        }
        
        return finalans;
	}

}
