class Solution {
	public boolean res = false;
	public boolean Game(int[] stacks) {
    	helper(stacks, 0, 0, 0, stacks.length-1, true);
    	return res;
	}
    
	public void helper(int[] stacks, int num1, int num2, int start, int end, boolean turn) {
    	if (start > end) {
        	if (num1 > num2) res = true;
        	return;
    	}
    	int val1 = stacks[start];
    	int val2 = stacks[end];
    	if (turn) {
        	if (val1 >= val2) {
            	helper(stacks, num1 + val1, num2,start+1,end,false);
        	} else {
            	helper(stacks, num1 + val2, num2,start,end-1,false);
        	}
       	 
       	 
    	} else {
        	if (val1 <= val2) {
            	helper(stacks, num1, num2 + val2,start+1,end,true);
        	} else {
            	helper(stacks, num1, num2 + val2,start,end-1,true);
        	}
    	}
   	 
	}
}
