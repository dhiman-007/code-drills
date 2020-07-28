https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3320/

class Solution {
    public int firstUniqChar(String s) {
    int i=0,j=0;
        int freq[] = new int [26];
        for(i=0;i<s.length();i++){
            freq[s.charAt(i)-97]++;
        }
        for(i=0;i<s.length();i++){
            if(freq[s.charAt(i)-97]==1)
                return i;
        }
       return -1;
    }
}
