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

class cray {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        long a[] = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextLong();
        }
        int cnt = 1;
        if (n == 1) {
            System.out.println(1);
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] > c) {
                cnt = 1;
            } else {
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
