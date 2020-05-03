class Solution {
	public List<Integer> countSmaller(int[] nums) {
    	List<Integer> ans = new ArrayList<>();
    	if(nums.length == 0)
        	return ans;
   	 
    	for(int i = 0; i < nums.length - 1; i++){
        	int count = 0;
        	for (int j = i+1; j < nums.length; j++){
            	if(nums[i] > nums[j])
                	count++;
        	}
        	ans.add(count);
    	}
    	//Last number in nums always return 0
    	ans.add(0);
    	return ans;
	}
}
