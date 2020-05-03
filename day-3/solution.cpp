class Solution {
public:

int BonusPoints(vector<int>& rankings) {
	int n=rankings.size();
	vector<int>points(n,1);
	for(int i=1;i<n;i++){
    	if(rankings[i]>rankings[i-1])
               points[i]=points[i-1]+1;
	}
	int sum=points[n-1];
	for(int i=n-2;i>=0;i--){
    	if(rankings[i]>rankings[i+1])
        	points[i]=max(points[i],points[i+1]+1);
    	sum+=points[i];
	}
   return sum;
}

};
