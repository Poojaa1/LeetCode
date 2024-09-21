class Solution(object):
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.
        """
        i=j=0
        t=m+n
        sorted_list=[]
        while(i<m) and (j<n):
            if(nums1[i]<=nums2[j]):
                sorted_list.append(nums1[i])
                i+=1
            else:
                sorted_list.append(nums2[j])
                j+=1
        while(i<m):
            sorted_list.append(nums1[i])
            i+=1
        while(j<n):
            sorted_list.append(nums2[j])
            j+=1
        for i in range(t):
            nums1[i]=sorted_list[i]