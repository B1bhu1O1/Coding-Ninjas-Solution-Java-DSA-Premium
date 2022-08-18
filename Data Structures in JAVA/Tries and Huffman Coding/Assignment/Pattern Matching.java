/*
Given a list of n words and a pattern p that we want to search. Check if the pattern p is present the given words or not. Return true if the pattern is present and false otherwise.
Input Format :
The first line of input contains an integer, that denotes the value of n.
The following line contains n space separated words.
The following line contains a string, that denotes the value of the pattern p.
Output Format :
The first and only line of output contains true if the pattern is present and false otherwise.
Constraints:
Time Limit: 1 sec
Sample Input 1 :
4
abc def ghi cba
de
Sample Output 2 :
true
Sample Input 2 :
4
abc def ghi hg
hi
Sample Output 2 :
true
Sample Input 3 :
4
abc def ghi hg
hif
Sample Output 3 :
false
*/


import java.util.ArrayList;

class TrieNode{
	char data;
	boolean isTerminating;
	TrieNode children[];
	int childCount;

	public TrieNode(char data) {
		this.data = data;
		isTerminating = false;
		children = new TrieNode[26];
		childCount = 0;
	}
}

public class Trie {

	private TrieNode root;
    private int count;

    public Trie() {
        root = new TrieNode('\0');
        count =0;
    }
    public void add(String word) {
        if(insert(root,word)) {
            this.count++;
        }
    }
    private boolean insert(TrieNode root,String word) {
        if(word.length() == 0) {
            if(!root.isTerminating){
                root.isTerminating = true;
                return true;
            } 
            else{
                return false;
            }
        }
        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if(child==null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return insert(child, word.substring(1));
    }
    public boolean search(String word) {
        return search(root, word);
    }
    private boolean search(TrieNode root,String word) {
        if(word.length()==0) {
            return true;
        }
        int childIndex = word.charAt(0)-'a';
        TrieNode child = root.children[childIndex];
        if(child==null) {
            return false;
        }
        return search(child, word.substring(1));

    }
    public void remove(String word) {
        if(delete(root, word)) {
            this.count-- ;
        }
    }
    private boolean delete(TrieNode root , String word) {

        if(word.length() == 0) {
            if(root.isTerminating) {
                root.isTerminating = false;
                return true;
            }
            else {
                return false;
            }
        }

        int childIndex = word.charAt(0)-'a';
        TrieNode childNode = root.children[childIndex];
        if(childNode==null) {
            return false;
        }
        boolean ans = delete(childNode,word.substring(1));

        if(!childNode.isTerminating && childNode.childCount==0) {
            root.children[childIndex] = null;
            root.childCount--;
        }


        return ans;
    }
    public int countWords() {
        return count;

    }
    public boolean patternMatching(ArrayList<String> input, String pattern) {
		
    	for(int i = 0 ; i<input.size();i++) {
    		
    		String string = input.get(i);
    		Trie suffixTrie = new Trie();
    		for(int j=0;j<string.length();j++) {
    			suffixTrie.add(string.substring(j));
    		}
    		if(suffixTrie.search(pattern)) {
    			return true;
    		}
    		
    	}
    	return false;
    	
	}
}


