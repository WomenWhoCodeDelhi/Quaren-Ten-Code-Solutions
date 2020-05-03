class Solution {
	vector <int> dirx = {0,-1,1,0};
	vector <int> diry = {-1,0,0,1};
public:
	vector<vector<int>> Griweshka(vector<vector<int>>& Nomore) {
    	for(int i =0; i < Nomore.size(); i++)
        	for(int j =0; j < Nomore[0].size(); j++)
            	if(Nomore[i][j] != 0) bfs(i,j,Nomore);
    	return Nomore;
	}
	void bfs(int i, int j, vector <vector <int>> &x){
    	queue <pair <int,int>> que;
    	que.push({i,j});
    	bool found = false;
    	int originali = i;
    	int originalj = j;
    	int dist = 0;
    	while(!false && !que.empty()){
        	int len = que.size();
        	dist++;
        	while(len--){
        	pair <int,int> top = que.front();
            	que.pop();
    	for(int it =0; it < 4; it++){
        	int newi = top.first + diry[it];
        	int newj = top.second + dirx[it];
        	if(newi < 0 || newi >= x.size() || newj < 0 || newj >= x[0].size()) continue;
        	if(x[newi][newj] == 0){
            	found = true; break;
        	}
        	else que.push({newi,newj});
    	}
    	}
        	if(found) break;
    	}
    	x[originali][originalj] = dist;
	}
};
