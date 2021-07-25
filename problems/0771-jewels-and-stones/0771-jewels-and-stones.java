class Solution {
    public int numJewelsInStones(String jewels, String stones) {
      HashSet <Character>map=  new HashSet<>();
        int j=jewels.length();
        
        int s=stones.length();
       for(int i=0;i<j;i++){
           char a=jewels.charAt(i);
           if(!map.contains(a)){
               map.add(a);
           }
       }
                   int num=0;

       for(int i=0;i<s;i++){
           char a=stones.charAt(i);
           if(map.contains(a)){
              num++; 
           }
       } 
        return num;
    }
}