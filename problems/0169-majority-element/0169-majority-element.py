class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        can=None
        count=0
        for num in nums:
            if count==0:
                can=num
                count=1
            elif num==can:
                count+=1
            else:
                count-=1
        return can