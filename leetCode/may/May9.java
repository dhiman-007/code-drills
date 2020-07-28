// https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3324/
class Solution {
    public boolean isPerfectSquare(int num) {
     int n=1;
        if(num==1){
            return true;
        }
        while(n<=num/2){
            if(n*n>=num){
                if(n*n == num)
                    return true;
                else
                    return false;
            }
            n++;
        }
    return false;
    }
}