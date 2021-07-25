class Solution {
    public boolean checkIfPangram(String sentence) {
        
        for(char i=97;i<=122;i++){
        {
            if(!sentence.contains(String.valueOf(i))){
                return false;
            }
         
            
        }
        
    }
    return true;
    }}