class Solution {
public:
	bool amusementPark(vector<vector<int>>& rides) {
    	int rides_num = rides.size();
    	if(rides_num <= 1) return true;
    	vector<int> unlock(rides_num, 0); // all locked in the begining
    	unlock[0] = 1;
    	queue<vector<int>> q;
    	q.push(rides[0]);
    	while(!q.empty()) {
        	if(count(unlock.begin(), unlock.end(), 0) == 0) return true;  // it means all unlocked
        	vector<int> rides_key = q.front();
        	q.pop();
        	int size = rides_key.size();
        	for(int i = 0; i < size; i++) {
            	int cur = rides_key[i];
            	if(unlock[cur] == 0) {
                	unlock[cur] = 1;
                	q.push(rides[cur]);
            	}
           	 
        	}
    	}
    	return false;
	}
};

