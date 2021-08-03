class Solution {
    public String sortSentence(String s) {
       String[] words=s.split(" ");
        String[] res=new String[words.length];
        String ans="";
        for(String word:words){
            int len=word.length()-1;
            int val=Character.getNumericValue(word.charAt(len));
            res[val-1]=word.substring(0,len);
            
        }
        for(String a:res){
            ans+=a;
            ans+=" ";
        }
        return ans.substring(0,ans.length()-1); 
    }
}