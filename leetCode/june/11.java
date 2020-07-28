https://leetcode.com/explore/challenge/card/june-leetcoding-challenge/540/week-2-june-8th-june-14th/3357/
//counting sort
class Solution {
    public void sortColors(int[] nums) {
        int freq[]= new int[3];
        
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        
        int ind=0;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<freq[i];j++){
                nums[ind++]=i;
                
            }    
        }
         
       for(int i=0;i<nums.length;i++){
           System.out.print(nums[i]);
       }
     
    }
}