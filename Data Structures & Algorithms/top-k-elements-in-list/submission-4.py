class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = {}
        heap = []
        res = []
        for num in nums:
            count[num] = count.get(num, 0) + 1
        for num, weight in count.items():
            heapq.heappush(heap, (-weight, num))
        for _ in range(k):
            _, num = heapq.heappop(heap)
            res.append(num)
        return res