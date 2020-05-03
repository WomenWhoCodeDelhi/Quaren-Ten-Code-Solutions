class Solution {
	public int threeStepsClosest(int[] steps, int X) {
    	Arrays.sort(steps);
    	int returnSum = Integer.MAX_VALUE;
    	int minDiff = Integer.MAX_VALUE;
    	for (int i = 0; i < steps.length - 2; i++) {
   		 int j = i+1;
   		 int k = steps.length - 1;
   		 while(j<k) {
   			 int sum = steps[i] + steps[j] + steps[k];
   			 int diff = Math.abs(X - sum);
   			 if(sum==X) {
   				 return sum;
   			 }
   			 returnSum = minDiff>diff?sum:returnSum;
            	minDiff = Math.min(minDiff, diff);
   			 if(sum<X) {
   				 j++;
   			 } else{
   				 k--;
   			 }
   		 }
   	 }
    	return returnSum;
	}
}

