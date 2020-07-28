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

class angry {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        while (q-- > 0) {
            int n = s.nextInt();
            int c = 0;
            int k = s.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (a[i] <= 0) {
                    c++;
                }
            }
            if (c >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }

    }
}
