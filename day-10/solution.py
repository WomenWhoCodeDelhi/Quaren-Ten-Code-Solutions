from collections import deque
class Solution:
	def Griweshka(self, Nomore: List[List[int]]) -> List[List[int]]:
    	for i in range(len(Nomore)):
        	for j in range(len(Nomore[0])):
            	if Nomore[i][j] == 1:
                	self.bfs(i,j,Nomore)
    	return Nomore
	def bfs(self,i,j,Nomore):
    	queue = deque([(i,j, 0)])
    	while queue:
        	#print(queue)
        	I,J,step = queue.popleft()
        	for r,c in (I+1,J),(I-1,J),(I,J+1),(I,J-1):
            	if 0 <= r < len(Nomore) and 0 <= c < len(Nomore[0]):
                	if Nomore[r][c] == 0:
                    	#print(r,c,step+1)
                    	Nomore[i][j] = step + 1
                    	return
                	else:
                    	queue.append((r,c,step+1))