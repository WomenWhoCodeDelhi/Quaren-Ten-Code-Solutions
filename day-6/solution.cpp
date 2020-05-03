class Solution {
public:
	bool go(vector<int>& furnitures,int value,int jump){
            if(!count(furnitures.begin(),furnitures.end(),value))return false;
    	if(value==furnitures[furnitures.size()-1])return true;
    	if(jump==0)return false;
    	if(go(furnitures,value+jump+1,jump+1))return true;
    	if(go(furnitures,value+jump,jump))return true;
    	if(go(furnitures,value+jump-1,jump-1))return true;
    	return false;
	}
    
	bool ThefloorIsLava(vector<int>& furnitures) {
    	for(int i=1;i<furnitures.size();i++){
        	if(furnitures[i]-furnitures[i-1]>i)return false;
    	}
    	return go(furnitures,furnitures[1],1);
	}
};
