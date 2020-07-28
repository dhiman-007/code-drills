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

class mindistance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int min = 999999999;
        int n = s.nextInt();
        boolean res = false;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        // System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    res = true;
                    int y = Math.abs(i - j);
                    // System.out.println(y);
                    if (y < min) {
                        min = y;
                    }
                }

            }
        }
        if (res == true) {
            System.out.println(min);
        } else {
            System.out.println(-1);
        }
    }

}
