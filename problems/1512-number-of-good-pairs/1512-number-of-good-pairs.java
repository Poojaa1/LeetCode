class Solution {
    public int numIdenticalPairs(int[] nums) {
       int ans=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                int temp=map.get(i);
                ans+=temp;
                map.put(i,temp+1);
            }
            else{
                map.put(i,1);
            }
        }
        return ans;
    }  
    }