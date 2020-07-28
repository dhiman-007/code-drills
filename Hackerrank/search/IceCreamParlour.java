/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.search;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class icecreamparlor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        while (q-- > 0) {
            int dollar = s.nextInt();
            int n = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int z = 0;
                for (int j = i + 1; j < n; j++) {
                    if (a[i] + a[j] == dollar) {
                        System.out.println((i + 1) + " " + (j + 1));
                        z = 1;
                        break;
                    }
                }
                if (z == 1) {
                    break;
                }
            }
        }
    }
}
