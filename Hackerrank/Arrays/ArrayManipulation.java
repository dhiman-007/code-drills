/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Arrays;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class ArrayManipuation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        long[] a = new long[n];
        int left, right, val;
        for (int i = 0; i < t; i++) {
            left = scan.nextInt();
            right = scan.nextInt();
            val = scan.nextInt();
            a[left - 1] += val;
            if (right < n) {
                a[right] -= val;
            }
        }
        long ans = 0;
        long flag = 0;
        for (int i = 0; i < n; i++) {
            flag += a[i];
            if (flag > ans) {
                ans = flag;
            }
        }
        System.out.println(ans);

    }

}
