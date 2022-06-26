class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        ans=len(nums)
        c=nums.count(val)
        for i in range(c):
            nums.remove(val)
            ans=ans-1
        return ans