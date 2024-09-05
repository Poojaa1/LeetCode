class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        ans={}
        index=0
        for num in nums:
            comp=target-num
            if comp in ans:
                return [ans[comp],index]
            ans[num]=index
            index+=1
        return []