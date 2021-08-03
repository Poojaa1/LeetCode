// class Solution {public void sortColors(int[] nums) {
//     int start = 0;
//     int end = nums.length - 1;
//     int i = 0;
//     while (i <= end) {
//         if (nums[i] == 0) {
//             nums[i]=1;
//             nums[start]=0;
//             start++;
//             i++;
//         } else if (nums[i] == 2) {
//             nums[i]=nums[end];
//             nums[end]=2;
//             end--;
//         } else {
//             i++;
//         }
//     }}
// }
class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int start=0;
        int last=nums.length-1;
      while(i<=last){
          if(nums[i]==2){
              nums[i]=nums[last];
              nums[last]=2;
              last--;
              
          }
          else if(nums[i]==0){

              nums[i]=1;
              nums[start]=0;
          
              start++;
              i++;
          
          }
          else{
              i++;
          }
      }
    }
}