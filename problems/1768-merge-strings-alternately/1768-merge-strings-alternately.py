class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        # ans=''
        # for i,j in zip(word1,word2):
        #     ans+=i+j
        # ans+=word1[len(word2):]+word2[len(word1):]
        # return ans
        ans=[] # list
        i=0
        while i < min(len(word1),len(word2)):
            ans.append(word1[i])
            ans.append(word2[i])
            i+=1
        if len(word1)<len(word2):
            ans.append(word2[len(word1):])
        else:
            ans.append(word1[len(word2):])
        return ''.join(ans)