# Definition for singly-linked list.
# class ListNode:
# 	def __init__(self, x):
#     	self.val = x
#     	self.next = None

class Solution:
	def nextLargerSeedling(self, head: ListNode) -> List[int]:
    	stack = []
    	output = []
   	 
    	cur = head
    	i = 0
    	while cur:
        	output.append(0)
        	while stack and stack[-1][0] < cur.val:
            	v, index = stack.pop()
            	output[index] = cur.val
        	stack.append((cur.val, i))
        	cur = cur.next
        	i += 1
   	 
    	return output
