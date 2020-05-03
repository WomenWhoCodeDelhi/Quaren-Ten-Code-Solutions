class Solution:
	def Game(self, stacks: List[int]) -> bool:
    	a = l = 0
    	while(stacks):
        	if stacks[0]>=stacks[-1]:
            	a += stacks.pop(0)
            	l += stacks.pop(-1)
        	else:
            	a += stacks.pop(-1)
            	l += stacks.pop(0)
    	return a>l
