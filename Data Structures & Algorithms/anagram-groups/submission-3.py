class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        freq_list = {}
        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord("a")] += 1
            count = tuple(count)
            freq_list[count] = freq_list.get(count, []) + [s]
        return list(freq_list.values())