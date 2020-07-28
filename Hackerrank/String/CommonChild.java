/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.String;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class commonchild // This program is all about calculating the length of longest common
// subsequence of a string
{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int x = s1.length();
        int y = s2.length();
        boolean res = false;
        int z = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    res = true;
                    z = 1;
                    break;
                }
            }
            if (z == 1) {
                break;
            }
        }
        // System.out.println(res);
        if (res == true) {
            int ch[][] = new int[x + 1][y + 1];
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= y; j++) {
                    if (i == 0 || j == 0) {
                        ch[i][j] = 0;
                    } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        ch[i][j] = ch[i - 1][j - 1] + 1;
                    } else {
                        ch[i][j] = Math.max(ch[i][j - 1], ch[i - 1][j]);
                    }
                }
            }

            int ind = ch[x][y];
            System.out.println(ind);
        } else {
            System.out.println(0);
        }

    }
}
