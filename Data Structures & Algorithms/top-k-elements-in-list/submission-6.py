class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res = []
        freq = Counter(nums)
        heap = [(-weight, num) for num, weight in freq.items()]
        heapq.heapify(heap)
        for _ in range(k):
            _, num = heapq.heappop(heap)
            res.append(num)
        return res