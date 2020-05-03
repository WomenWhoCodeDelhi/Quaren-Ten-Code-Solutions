public class Solution {
	public int BonusPoints(int[] rankings) {
    	int sum = 0;
    	int[] left2right = new int[rankings.length];
    	int[] right2left = new int[rankings.length];
    	Arrays.fill(left2right, 1);
    	Arrays.fill(right2left, 1);
    	for (int i = 1; i < rankings.length; i++) {
        	if (rankings[i] > rankings[i - 1]) {
            	left2right[i] = left2right[i - 1] + 1;
        	}
    	}
    	for (int i = rankings.length - 2; i >= 0; i--) {
        	if (rankings[i] > rankings[i + 1]) {
            	right2left[i] = right2left[i + 1] + 1;
        	}
    	}
    	for (int i = 0; i < rankings.length; i++) {
        	sum += Math.max(left2right[i], right2left[i]);
    	}
    	return sum;
	}
}
