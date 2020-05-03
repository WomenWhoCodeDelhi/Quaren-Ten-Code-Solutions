class Solution:
	def amusementPark(self, rides: List[List[int]]) -> bool:
    	keys,prev = {0},0
    	while prev<len(keys):
        	prev=len(keys)
        	keys |= { i for k in keys for i in rides[k] }
    	return prev == len(rides)
