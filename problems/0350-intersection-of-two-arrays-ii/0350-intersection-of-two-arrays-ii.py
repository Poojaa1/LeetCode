class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        hasmap={}
        arr=[]
        for num in nums1:
            if num in hasmap:
                hasmap[num]+=1
            else:
                hasmap[num]=1
        for num in nums2:
            if num in hasmap and hasmap[num]>0:
                arr.append(num)
                hasmap[num]-=1
        return arr