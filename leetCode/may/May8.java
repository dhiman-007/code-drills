//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3323/

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        
        if(coordinates.length==2)
            return true;
        
        int x1,y1,x2,y2, x3, y3, check=0;
        
         x1=coordinates[0][0];
         y1=coordinates[0][1];
         x2=coordinates[1][0];
         y2=coordinates[1][1];
        
        int i=0;
        for(i=2;i<coordinates.length;i++){
            x3=coordinates[i][0];
            y3=coordinates[i][1];
            //cross product of cordinates to check collinearity
            check= x1 * (y2 - y3) +  x2 * (y3 - y1) +  x3 * (y1 - y2); 
            if(check!=0){
                return false;
            }

        }
        return true;
    }
}