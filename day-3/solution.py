class Solution:
   
	def BonusPoints(self, rankings):
    	if not rankings:
        	return 0

    	n = len(rankings)
    	points = [1] * n
    	for i in range(1, n):
        	if rankings[i] > ratings[i - 1]:
            	points[i] = points[i - 1] + 1
       	 
    	for i in range(n - 2, -1, -1):
        	if rankings[i] > rankings[i + 1] and points[i] <= points[i + 1]:
            	points[i] = points[i + 1] + 1

    	return sum(points)
