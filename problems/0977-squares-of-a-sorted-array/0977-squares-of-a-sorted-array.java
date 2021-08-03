class Solution {
    public int[] sortedSquares(int[] nums) {
       int[] ans=new int[nums.length];
        int start=0;int end=nums.length-1;
        int index=end;
        while(start<=end){
            if(nums[start]*nums[start]>nums[end]*nums[end]){
                ans[index--]=nums[start]*nums[start];
                start++;
            }
            else{ans[index--]=nums[end]*nums[end];
end--;}
        }return ans;
    }
}