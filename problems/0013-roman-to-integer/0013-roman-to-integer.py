class Solution:
    def romanToInt(self, s: str) -> int:
        dic= {'I':1,'V':5,'X':10,'L':50,'C':100,'D':500,'M':1000}
        l=list(s)
        ans =0
        i=0
        if(len(l)-1==i):
            return dic.get(l[i])
        while (i < len(l)-1):
            if dic.get(l[i]) < dic.get(l[i+1]):
                ans= ans + (dic.get(l[i+1])-dic.get(l[i]))
                i=i+1
                if(i==len(l)-2):
                    ans+=dic.get(l[len(l)-1])
                    break
            else:
                ans=ans+dic.get(l[i])   
                if(i==len(l)-2):
                    ans+=dic.get(l[len(l)-1]) 
                    break
            i=i+1
        return ans