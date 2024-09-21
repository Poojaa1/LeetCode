class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t):
            return False
        se,te={},{}
        for char in s:
            se[char]=se.get(char,0)+1
        for char in t:
            te[char]=te.get(char,0)+1
        return se==te