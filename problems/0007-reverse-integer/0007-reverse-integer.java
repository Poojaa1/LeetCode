class Solution {
    public int reverse(int x) {
       long ans=0;
    while(x!=0){
        ans=x%10;
        x=x/10;
        ans=ans*10;
      //  ans=(x%10)+(ans*10);
       // x=x/10;
    
        
    } return ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE ? 0: (int) ans;
        
    }
}