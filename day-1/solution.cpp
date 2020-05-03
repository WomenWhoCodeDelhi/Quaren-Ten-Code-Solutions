class Solution {
public:
	int threeStepsClosest(vector<int>& steps, int X) {
  	sort(steps.begin(), steps.end());
  	int min_diff = INT_MAX, closest = 0;
  	for(int i = 0; i < int(steps.size()) - 2; ++i) {
    	int left = i + 1, right = int(steps.size()) - 1;
    	while(left < right) {
      	int sum = steps[i] + steps[left] + steps[right];
      	if(abs(X - sum) < abs(min_diff)) {
        	min_diff = X - sum;
        	closest = sum;
      	}
      	if(sum < X) {
        	left++;
      	}else if(sum > X) {
        	right--;
      	}else {
        	return X;
      	}
    	}
  	}
  	return closest;
	}
};
