class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        l=0
        r=1
        for r in range(0,len(nums)):
            if nums[r]!=nums[l]:
                l+=1
                nums[l]=nums[r]
        return l+1