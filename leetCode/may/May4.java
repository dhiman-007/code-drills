class Solution {
    public int findComplement(int num) {
        String x= Integer.toBinaryString(num);
        char ch[]=x.toCharArray();
        int i=0;
        for(i=0;i<ch.length;i++){
            if(ch[i]=='1')
                ch[i]='0';
            else
                ch[i]='1';
        }
        return Integer.parseInt(String.valueOf(ch), 2);
    }
}