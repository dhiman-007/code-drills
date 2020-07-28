https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3377/
class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        if(n==0)
            return 0;
        while(true){
            n-=i;
            i++;
            //System.out.println(i);
            if(n<=i){
                if(n==i){
                    return i;
                }
            return i-1;
            }
            
        }
    }
}