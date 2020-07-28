//https://leetcode.com/explore/featured/card/may-leetcoding-challenge/536/week-3-may-15th-may-21st/3332/


// 35/36 test case passed, could come up with some different logic

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> x = new ArrayList<Integer>();
        int i=0;String s1="";
        char ch2[]=p.toLowerCase().toCharArray();
        Arrays.sort(ch2);
        for(i=0;i<=s.length()-p.length();i++){
            s1=s.substring(i,i+p.length()).toLowerCase();
      
            char ch1[]=s1.toCharArray();
            Arrays.sort(ch1);
            if(Arrays.equals(ch1,ch2)){
                     // System.out.println(String.valueOf(ch1));
                x.add(i);
            }
        }
        return x;
    }
}