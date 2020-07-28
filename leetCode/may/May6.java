https://leetcode.com/explore/featured/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3321/
class Solution {
    public int majorityElement(int[] nums) {
        int i=0,j=0,count=0;
        if(nums.length==1){
            return nums[0];
        }
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(i=0;i<nums.length;i++){
            x.add(nums[i]);
        }
        ArrayList<Integer> z= new ArrayList <Integer>();
        for(i=0;i<x.size()-1;i++){
          count=1;
            if(!(z.contains(x.get(i)))){
                  for(j=i+1;j<x.size();j++){
                    if(x.get(i).equals(x.get(j))){
                    ++count;
                }
            }
            z.add(x.get(i));
            if(count > nums.length/2 ){
                return x.get(i);
            }
        }
    }
    return 0;
    }
               
}