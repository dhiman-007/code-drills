class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int i=0,j=0,count=0;
        char ch1[]=ransomNote.toCharArray();
        char ch2[]=magazine.toCharArray();
       for(i=0;i<ch1.length;i++){
           for(j=0;j<ch2.length;j++){
               if(ch2[j]==ch1[i]){
                   ch2[j]=' '; 
                   count++;
                   break;
               }
           }
       }
        if(count==ransomNote.length()){
            return true;
        }else{
            return false;
        }
    }
}