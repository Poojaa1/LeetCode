class Solution {
    public String reverseWords(String s) {
     String[] words=s.split(" ");
StringBuilder res=new StringBuilder();
        for(String word:words){
            res.append(new StringBuilder(word).reverse().toString()+ " ");
            
          
        }String abc= res.toString();
        return abc.substring(0,abc.length()-1);
    }
}