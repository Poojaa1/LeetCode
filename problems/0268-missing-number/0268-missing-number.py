class Solution(object):
    def missingNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        total=n*(n+1)//2
        actualsum=0
        for num in nums:
            actualsum+=num
        return total-actualsum