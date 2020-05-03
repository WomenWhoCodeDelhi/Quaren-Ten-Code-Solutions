class Solution:
	def countSmaller(self, nums):
    	if len(nums) == 0:
        	return []
    	retu = [0]
    	num1 = [nums[-1]]
    	import bisect
    	for i in range(len(nums) - 2, -1, -1):
        	v = bisect.bisect_left(num1, nums[i])
        	retu.append(v)
        	num1 = num1[:v] + [nums[i]] + num1[v:]
    	return retu[::-1]	
