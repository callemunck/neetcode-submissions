class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a, b) ->
                (points[a][0] * points[a][0] + points[a][1] * points[a][1]) - 
                (points[b][0] * points[b][0] + points[b][1] * points[b][1])
        );
        for (int i = 0; i < points.length; i++) {
            pq.offer(i);
        }
        int[][] res = new int[k][];
        for (int i = 0; i < k; i++) {
            res[i] = points[pq.poll()];
        }
        return res;
    }
}