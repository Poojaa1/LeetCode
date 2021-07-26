class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
    int result=0;
    HashSet<Character>set=new HashSet<>();
        for(char c:allowed.toCharArray()){
            set.add(c);
        }
       // System.out.println(set);
        int len=words.length;
    for(String word:words){
        for(char s: word.toCharArray()){
            if(!set.contains(s)){
                len--;
                break;
            }
        }
    }
    return len;
    }}