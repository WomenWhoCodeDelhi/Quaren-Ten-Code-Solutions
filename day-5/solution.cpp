class Solution {
public:
	unordered_map<int, vector<int> > tree;
	vector<int> a;
    
	vector<int> merge(vector<int> v1, vector<int> v2) {
    	int i = 0, j = 0;
    	vector<int> res;
    	while(i < v1.size() && j < v2.size()) {
        	if(v1[i] < v2[j]) {
            	res.push_back(v1[i++]);
        	}
        	else res.push_back(v2[j++]);
    	}
    	while(i < v1.size()) res.push_back(v1[i++]);
    	while(j < v2.size()) res.push_back(v2[j++]);
    	return res;
	}
    
	vector<int> build(int node, int start, int end) {
    	if(start == end) {
        	tree[node].push_back(a[start]);
        	return tree[node];
    	}
    	vector<int> v1 = build(2*node, start, (start + end)/2);
    	vector<int> v2 = build(2*node + 1, (start + end)/2 + 1, end);
    	tree[node] = merge(v1, v2);
    	return tree[node];
	}
    
	int query(int node, int start, int end, int l, int r, int val) {
    	if(end < l || start > r) return 0;
    	if(start >= l && end <= r) {
        	return (int)((lower_bound(tree[node].begin(), tree[node].end(), val) - tree[node].begin()));
    	}
    	return query(2*node, start, (start + end)/2, l, r, val) + query(2*node + 1, (start + end)/2 + 1, end, l, r, val);
	}
	vector<int> countSmaller(vector<int>& nums) {
    	a = nums;
    	vector<int> res;
    	if(nums.size() == 0) return res;
    	build(1, 0, (int)nums.size() - 1);
    	for(int i = 0; i < nums.size(); i++) {
        	int ans = query(1, 0, nums.size() - 1, i + 1, nums.size(), a[i]);
        	res.push_back(ans);
    	}
    	return res;
	}
};
