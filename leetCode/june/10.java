//https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3356/
class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length==1){
            if(target>nums[0]){
                return 1;
            }else{
                return 0;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(target>=nums[i] && target<=nums[i+1]){
                    if(target==nums[i]){
                        return i;
                    }
                return i+1;
            }
        }
        if(target<nums[0]){
            return 0;
        }else{
            return nums.length;
        }
    }
}

// Hello 