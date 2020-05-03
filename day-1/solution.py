class Solution:
	def threeStepsClosest(self, s: List[int], X: int) -> int:
    	s.sort()
    	b = sum(s[:3])
    	n = len(s)
    	for i in range(n):
        	l = i + 1
        	r = n - 1
        	while l < r:
            	s1 = s[i] + s[l] + s[r]
            	if s1 == X:
                	return s1
            	if abs(s1 - X) < abs(b - X):
                	b = s1
            	if s1 < X:
                	l += 1
            	else:
                	r -= 1
    	return b
