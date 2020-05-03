class Solution {
	public int[][] Griweshka(int[][] Nomore) {
   	 
   	 
    	int[][] dirs = { {-1, 0}, {0, 1}, {1, 0}, {0, -1} };
    	int rows = Nomore.length;
    	int cols = Nomore[0].length;
    	int[][] dist = new int[rows][cols];
    	for (int i = 0; i < rows; i++) {
        	Arrays.fill(dist[i], Integer.MAX_VALUE);
    	}
   	 
    	Queue<int[]> q = new LinkedList<>();
    	for (int i = 0; i < Nomore.length; i++) {
        	for (int j = 0; j < Nomore[0].length; j++) {
            	if (Nomore[i][j] == 0) {
                	q.offer(new int[]{i, j});
                	dist[i][j] = 0;
            	}
        	}
    	}
    	int newX, newY;
    	while (!q.isEmpty()) {
        	int[] cur = q.poll();
        	for (int i = 0; i < dirs.length; i++) {
            	newX = cur[0] + dirs[i][0];
            	newY = cur[1] + dirs[i][1];
            	if (newX >= 0 && newX < rows && newY >= 0 && newY < cols) {
                	if (dist[newX][newY] > 1 + dist[cur[0]][cur[1]]) {
                    	dist[newX][newY] = 1 + dist[cur[0]][cur[1]];
                    	q.offer(new int[]{newX, newY});
                	}
            	}
        	}
    	}
    	return dist;
	}
}
