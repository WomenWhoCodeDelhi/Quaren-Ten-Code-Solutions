class Solution {
public:
	bool Game(vector<int>& stacks) {
    	int Mansi_count=0,riya_count=0,n=stacks.size(),last=n-1,first=0;
    	bool chance=true;
   	 
    	while(n!=0)
    	{
        	if(chance)
        	{
            	Mansi_count+=max(stacks[last],stacks[first]);
            	if(stacks[first]>=stacks[last]){first++;}
            	else{last--;}
        	}
        	else
        	{
            	riya_count+=min(stacks[last],stacks[first]);
            	if(stacks[first]>=stacks[last]){last--;}
            	else{first++;}
        	}
        	n--;
        	chance=(!chance);
    	}
    	return Mansi_count>riya_count;
	}
};
