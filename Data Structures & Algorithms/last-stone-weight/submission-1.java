class Solution {
    public int lastStoneWeight(int[] stones) {
        int y, x;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.offer(stone);
        }
        while (pq.size() > 1) {
            x = pq.poll();
            y = pq.poll();
            if (x > y) {
                pq.offer(x - y);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
