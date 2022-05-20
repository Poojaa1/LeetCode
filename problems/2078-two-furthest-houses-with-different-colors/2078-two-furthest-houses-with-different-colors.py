class Solution:
    def maxDistance(self, colors):
        d=0
        for i,j in enumerate(colors):
            for a,b in enumerate(colors):
                if j!=b:
                    if abs(i-a)>d:
                        d=abs(i-a)
        return d