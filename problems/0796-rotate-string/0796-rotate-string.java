class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()==s.length()&&(s+s).indexOf(goal)!=-1){
            return true;
        }
        else
            return false;
    }
}