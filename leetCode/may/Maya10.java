//https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3325/
class Solution {
    public int findJudge(int N, int[][] trust) {
       ArrayList<Integer> noDup = new ArrayList<Integer>();
        int i=0,j=0, c=0;
        for(i=0; i<trust.length ;i++){
            if(!noDup.contains(trust[i][0])){
                noDup.add(trust[i][0]);
            }
        }
        int check=0;
        for(i=1;i<=N;i++){
            if(!noDup.contains(i)){
                check=i;
                break;
            }
        }
        for(i=0;i<noDup.size();i++){
            for(j=0;j<trust.length;j++){
                if(noDup.get(i)==trust[j][0]){
                    if(trust[j][1]==check){
                        c++;
                        break;
                    }
                }
            }
        }
        if(c==N-1)
            return check;
        else    
            return -1;
    }
}