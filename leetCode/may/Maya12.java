// https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3327/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int c=1;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
               if(c==1){
                    return nums[i];
                }
                c=1;
            }
            else{
                c++;
            }
        }
    return 1;
    }
}