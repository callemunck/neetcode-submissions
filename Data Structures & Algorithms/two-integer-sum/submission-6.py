class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #seen = {n : i for i, n in enumerate(nums)}
        seen = {nums[0] : 0}
        for i, n in enumerate(nums[1:]):
            if target - n in seen: return [seen[target - n], i+1]
            seen[n] = i+1
        return []
