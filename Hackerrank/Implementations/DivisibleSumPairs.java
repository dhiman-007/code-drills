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

class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        int i, j;
        int c = 0;

        for (i = 0; i < n; i++) {
            a[i] = s.nextInt();
            //System.out.println(a[i]);
        }
        //System.out.println(a[i]);

        for (i = 0; i < n; i++) {

            for (j = i + 1; j < n; j++) {
                if ((a[i] + a[j]) % k == 0) {
                    c++;
                }
            }

        }
        System.out.println(c);
    }
}
