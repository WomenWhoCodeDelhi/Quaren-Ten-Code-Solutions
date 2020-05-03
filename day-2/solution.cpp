class Solution {
public:
	vector<int> nextLargerSeedling(ListNode* head) {
    	vector<int> ans;
    	if(!head) return ans;
    	ListNode* slow = head;
   	 
    	while(slow->next){
        	ListNode* fast = slow->next;
        	while(fast && slow->val >= fast->val) fast = fast->next;
        	if(!fast) ans.push_back(0);
        	else ans.push_back(fast->val);
        	slow = slow->next;
    	}
    	ans.push_back(0);
    	return ans;
	}
};
