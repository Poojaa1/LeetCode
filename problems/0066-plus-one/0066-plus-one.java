class Solution {
    public int[] plusOne(int[] digits) {
       int a=digits.length-1;
        boolean b=true;
        while(b&&a>-1){
          if(digits[a]==9){
              digits[a]=0;
          }
            else{
                digits[a]++;
                b=false;
            }
        a--;}
        if(digits[0]==0){
            int[] result=new int[digits.length+1];
           result[0]=1;
            for(int i=1;i<digits.length;i++){
                result[i]=digits[i-1];
            }
        return result;    
        }
                
        
        return digits;
    }
}