//https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3355/
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, ind=0, z=0;
        if(s.length()==0){
            return true;
        }
        for(i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(ind)){
                z++;
                ind++;
                if(z==s.length()){
                return true;
               }
            }
        }
        return false;
    }
}