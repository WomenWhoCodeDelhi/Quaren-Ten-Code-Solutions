class Solution {
	Set<Integer> vb;
	Set<Integer> vs;
	Map<Integer, List<Integer>> map;
	int m, n;
	public int Trains(int[][] rs, int S, int T) {
    	vs = new HashSet<>();
    	vb = new HashSet<>();
    	map = new HashMap<>();
    	m = rs.length;
    	n = rs[0].length;
    	for (int i = 0; i < m; i++) {
        	for (int stop : rs[i]) {
            	map.computeIfAbsent(stop, k -> new ArrayList<>()).add(i);
        	}
    	}
    	Queue<Integer> q = new LinkedList<>();
    	int res = 0;
    	q.add(S);
    	while (!q.isEmpty()) {
        	int l = q.size();
        	for (int i = 0; i < l; i++) {
            	int stop = q.poll();
            	if (stop == T) return res;
            	if (!map.containsKey(stop)) continue;
            	vs.add(stop);
            	for (int train : map.get(stop)) {
                	if (vb.contains(bus)) continue;
                	vb.add(train);
                	for (int st : rs[train]) {
                    	if (vs.contains(st)) continue;
                    	vs.add(st);
                    	q.offer(st);
                	}
            	}
        	}
        	res++;
    	}
    	return -1;
	}
}
