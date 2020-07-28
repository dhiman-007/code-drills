/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

/**
 *
 * @author Dhimam
 */
import java.util.*;

import java.util.*;

class Create {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 0, j = 0;
        int n = s.nextInt();
        s.nextLine();
        char ch[][] = new char[n][n];
        for (i = 0; i < n; i++) {
            String s1 = s.nextLine();
            for (j = 0; j < n; j++) {
                ch[i][j] = s1.charAt(j);
            }
        }
        int x = ch[0][0];
        int y = ch[0][1];
        int z = 0;
        if (x == y) {
            System.out.println("NO");
            return;
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (j == n - 1 - i || i == j) {
                    if (ch[i][j] != x) {
                        z = 1;
                        break;

                    }
                } else if (ch[i][j] != y) {
                    z = 1;
                    break;

                }
                if (z == 1) {
                    break;
                }
            }
            if (z == 1) {
                break;
            }
        }
        if (z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
