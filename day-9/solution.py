class Solution:
	def Trains(self, routes: List[List[int]], S: int, T: int) -> int:
    	stop_train = collections.defaultdict(set)
    	begin_train = []
    	for i, route in enumerate(routes):
        	for stop in route:
            	if stop==S:
                	begin_train.append(i)
            	stop_train[stop].add(i)
    	if S ==T:return 0
   	 
    	def bfs(b):
        	if T in routes[b]:return 1
        	from collections import deque
        	Q = deque([(S,b, 1)])
        	seen_train = {0}
        	while Q:
            	stop, train, d = Q.popleft()   
            	for stop in routes[train]:
                	for nxt_train in stop_train[stop]:
                    	if nxt_train not in seen_train:
                        	if T in routes[nxt_train]:return d+1
                        	seen_train.add(nxt_train)
                        	Q.append((stop, nxt_train, d+1))
        	return -1
   	 
    	res = [bfs(b) for b in begin_train]
    	fin_res = [r for r in res if r!=-1]
    	return min(fin_res) if fin_res else -1    
