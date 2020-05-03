class Solution:
	def ThefloorIsLava(self, furnitures):
    	"""
    	:type furnitures: List[int]
    	:rtype: bool
    	"""
    	dic = collections.defaultdict(set)
    	dic[0].add(0)
    	for i in range(len(furnitures)):
        	if furnitures[i] in dic:
            	for val in dic[furnitures[i]]:
                	if val > 0:
                    	dic[furnitures[i]+val].add(val)
                	if val > 1:
                    	dic[furnitures[i]+val-1].add(val-1)
                	dic[furnitures[i]+val+1].add(val+1)
    	return furnitures[-1] in dic
