class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        pref=strs[0]
        for word in strs:
            ans=''
            for i in range(len(word)):
                if(i>=len(pref)) or pref[i]!= word[i]:
                    break
                else:
                    ans+=word[i]
            pref=ans
        return ans