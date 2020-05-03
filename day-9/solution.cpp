class Solution {
public:
	int Trains(vector<vector<int>>& routes, int S, int T) {
    	unordered_map<int, vector<int>> graph;
    	for(int i=0; i<routes.size(); i++) {
        	for(int j=0; j<routes[i].size(); j++) {
            	graph[routes[i][j]].push_back(i);
        	}
    	}   	 
   	 
    	deque<pair<int, int>> de;
    	de.push_back({S, 0});   	 
    	vector<int> usedRoutes(routes.size(), 0);
    	unordered_set<int> visitedStops;
    	visitedStops.insert(S);
    	while(!de.empty()) {
        	auto e = de.front(); de.pop_front();
        	cout << e.first <<" " << e.second << endl;
        	if(e.first == T) return e.second;
       	 
        	for(auto r:graph[e.first]) {           	 
            	if(usedRoutes[r] == 0) {
                	usedRoutes[r] = 1;
                	for(auto b:routes[r]) {
                    	if(visitedStops.find(b) == visitedStops.end()) {
                        	visitedStops.insert(b);
                        	de.push_back({b, e.second+1});
                    	}
                	}
            	}
        	}
    	}    
    	return -1;
	}
};
