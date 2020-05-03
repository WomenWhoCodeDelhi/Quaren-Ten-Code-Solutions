/**
 * Definition for singly-linked list.
 * public class ListNode {
 * 	int val;
 * 	ListNode next;
 * 	ListNode(int x) { val = x; }
 * }
 */
class Solution {
	public int[] nextLargerSeedling(ListNode head) {
  		  int l=0;
    
	ListNode t=head;
    
	while(t!=null)
	{
    	t=t.next;
    	l++;
	}
    
	int a[]=new int[l];
	t=head;
	int top=-1;
	while(t!=null)
	{
    	a[++top]=t.val;
    	t=t.next;
	}
    
	int max=0;
	Stack<Integer> stack=new Stack<>();
    
    
	for(int i=l-1;i>=0;i--)
	{
    	while(!stack.empty() && stack.peek()<=a[i])
    	{
        	stack.pop();
    	}
    	int y=a[i];
    	if(!stack.empty() && stack.peek()>a[i])
        	a[i]=stack.peek();
    	else
        	a

[i]=0;
   	 
    	stack.push(y);
	}
    
    
	return a;
}
    
}
