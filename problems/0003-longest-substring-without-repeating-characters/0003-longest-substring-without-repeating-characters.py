class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        l=0
        r=0
        totallen=len(s)-1
        count=0
        charset=set()
        while r<len(s):
            if s[r] not in charset:
                charset.add(s[r])
                r+=1
                count=max(count, r-l)
            else:
                charset.remove(s[l])
                l+=1
        return count