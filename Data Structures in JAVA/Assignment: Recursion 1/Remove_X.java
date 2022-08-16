/*
Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S
Output format :
Modified String
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:
*/



public class solution {

	// Return the changed string
	public static String removeX(String str){
		// Write your code here

        if(str.length()==0) {
			return str;
		}
		String smallAns=removeX(str.substring(1));
		if(str.charAt(0)=='x') {
			return smallAns;
		}
		return str.charAt(0) + smallAns;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="xxxaxbxcdsxexxxx";
		System.out.println(removeX(str));

	}
}

