class Solution {
    public int numJewelsInStones(String J, String S) {
        int c=0;
        for(int i=0;i<S.length();i++){
            if(J.contains(""+S.charAt(i)))
                c++;
            
        }
        return c;
    }
}