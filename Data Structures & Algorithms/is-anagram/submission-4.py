class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): return False 
        shm = {}
        thm = {}
        for x, y in zip(s, t):
            shm[x] = shm.get(x, 0) + 1
            thm[y] = thm.get(y, 0) + 1
        return shm == thm