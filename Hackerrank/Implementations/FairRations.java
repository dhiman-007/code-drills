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

class fairrotations {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer a[] = new Integer[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        // Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            if (a[i] % 2 != 0) {
                a[i] = a[i] + 1;
                a[i + 1] = a[i + 1] + 1;
                c = c + 2;
            }
        }
        boolean res = true;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                res = false;
                break;
            }
        }
        if (res == false) {
            System.out.println("NO");
        } else {
            System.out.println(c);
        }

    }
}
