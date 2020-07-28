https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/544/week-1-july-1st-july-7th/3379/
class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int i=0;
        int res[]= new int[cells.length];
        
        int x=N%14==0?14:N%14; // after every 14 iteration, repeats the Starting cells value
        for(int j=1;j<=x;j++){
        
        for(i=1;i<cells.length-1;i++){
            
            if((cells[i-1]==0 && cells[i+1]==0) || (cells[i-1]==1 && cells[i+1]==1)){
                res[i]=1;
            }else{
                res[i]=0;
            }
            
         }
        res[0]=0;res[cells.length-1]=0;
        cells=res.clone();
        }
        return res;
    }
}