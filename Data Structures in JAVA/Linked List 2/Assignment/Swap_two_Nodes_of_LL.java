/*
You have been given a singly linked list of integers along with two integers, 'i,' and 'j.' Swap the nodes that are present at the 'i-th' and 'j-th' positions.
Note :
Remember, the nodes themselves must be swapped and not the datas.

No need to print the list, it has already been taken care. Only return the new head to the list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains the elements of the singly linked list separated by a single space.

The second line of input contains two integer values 'i,' and 'j,' respectively. A single space will separate them.
 Remember/consider :
While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
Output format :
For each test case/query, print the elements of the updated singly linked list.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= M <= 10^5
Where M is the size of the singly linked list.
0 <= i < M
0 <= j < M

Time Limit: 1sec
Sample Input 1 :
1
3 4 5 2 6 1 9 -1
3 4
Sample Output 1 :
3 4 5 6 2 1 9 
 Sample Input 2 :
2
10 20 30 40 -1
1 2
70 80 90 25 65 85 90 -1
0 6
 Sample Output 2 :
10 30 20 40 
90 80 90 25 65 85 70 
*/


/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/

public class Solution {
    
     public static LinkedListNode<Integer> findPrevNode(LinkedListNode<Integer> head, int count)
    {
        for (int i=0;i<count-1;i++)
        {
            head=head.next;
        }
        return head;
    }

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        
         if (head==null)
        {
            return head;
        }
        else if (j==0 || (i-j==-1))
        {
            int temp=i;
            i=j;
            j=temp;
        }
        
        LinkedListNode<Integer> swap1=null,swap2=null,p1=null,n1=null,p2=null,n2=null;
        
        if (i==0 && i-j==1)
        {
            swap1=head;
            swap2=head.next;

            swap1=swap1.next;
            head=swap2;
            swap2.next=swap1;
            
        }
        else if(i-j==1)
        {
            p1=findPrevNode(head,j);
        	swap1=p1.next;
            swap2=swap1.next;
            n2=swap2.next;
            //System.out.println(p1.data);
            //System.out.println(swap1.data);
            //System.out.println(swap2.data);
            //System.out.println(n2.data);
            
            p1.next=swap2;
            swap2.next=swap1;
            swap1.next=n2;
            
        }
        else if (i==0)
        {
            swap1=head;
            n1=swap1.next;
            p2=findPrevNode(head,j);
            swap2=p2.next;
            n2=swap2.next;
            
            head=swap2;
            head.next=n1;
            p2.next=swap1;
            swap1.next=n2;
            
        }
        else
        {
        	p1=findPrevNode(head,i);
        	p2=findPrevNode(head,j);
        	swap1=p1.next;
        	swap2=p2.next;
        	n1=swap1.next;
        	n2=swap2.next;
        
        	p1.next=swap2;
        	p2.next=swap1;
        	swap1.next=n2;
        	swap2.next=n1;
        }
        
        
        return head;
	}

}

