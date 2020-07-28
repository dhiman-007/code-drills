/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Implementations;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class Solution {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        char ch[][] = new char[n][m]; // 2D char array
        for (int i = 0; i < n; i++) {
            String data = "";
            if (s.hasNext()) { // input from user 
                data = s.next();
            } else {
                break;
            }
            for (int j = 0; j < m; j++) {
                ch[i][j] = data.charAt(j);
            }
        }
        ArrayList<Integer> z = new ArrayList();
        for (int i = 0; i < n; i++) {
            int c = 0;

            for (int j = 0; j < m; j++) {
                if (ch[i][j] == '1') {
                    c++;
                }
            }
            // System.out.println(c+"@");
            int k = 0, count = 0;
            int xx = i + 1;
            // System.out.println(xx+"#");
            for (int h = xx; h < n; h++) {
                while (k < m) {

                    if (ch[h][k] == '1' && ch[i][k] == '0') {
                        // System.out.println(h+" "+k+" "+i);
                        count++;
                    }
                    k++;
                }
                //System.out.println(count+"&&&&");
                z.add(c + count);
                // System.out.println(c+count+"***");
                count = 0;
                k = 0;
            }
        }
        System.out.println(Collections.max(z));
        System.out.println(Collections.frequency(z, (Collections.max(z))));
    }
}
