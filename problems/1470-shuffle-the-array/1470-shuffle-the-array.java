class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a=2*n;
        int b=0;
	        int[] s=new int[a];
        for(int i=0;i<nums.length-1;i+=2){
            s[i]=nums[b];
            s[i+1]=nums[n+b];
            b++;
        
    }
        return s;
        
}}