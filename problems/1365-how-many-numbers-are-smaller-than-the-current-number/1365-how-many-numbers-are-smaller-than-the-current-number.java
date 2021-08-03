class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] c=nums.clone();
        Arrays.sort(c); 
        int l=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<l;i++){
            if(!map.containsKey(c[i])){
                map.put(c[i],i);
            }
        }
        
        
        for(int i=0;i<l;i++){
            c[i]=map.get(nums[i]);
        }return c;
}}