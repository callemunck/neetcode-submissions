class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        heap = []
        res = []
        freq = Counter(nums)
        for num, weight in freq.items():
            heapq.heappush(heap, (-weight, num))
        for _ in range(k):
            _, num = heapq.heappop(heap)
            res.append(num)
        return res