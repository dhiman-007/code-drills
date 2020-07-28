//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3328/

class Solution {
    public String removeKdigits(String num, int k) {
            
        if(num.length()==k)
            return "0";
        
        StringBuilder s = new StringBuilder(num);
        
        int i=0, j=0;
        for(i=0;i<k;i++){
             j=0;
            while(j<s.length()-1 && s.charAt(j)<=s.charAt(j+1)){
                j++;
            } 
            s.delete(j,j+1); 
        }
        
        for(i=0;i<s.length();i++){
            if(s.charAt(i)!='0')
                return s.substring(i);
        }
        
      return "0";  
    }
}