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
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int c = 0;
        int k = 0;
        int[] a1 = new int[m];
        for (int i = 0; i < m; i++) {
            a1[i] = in.nextInt();
        }
        int[] o1 = new int[n];
        for (int j = 0; j < n; j++) {
            o1[j] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {

            if (a + a1[i] >= s && a + a1[i] <= t) {
                c++;
            }

        }
        System.out.println(c);
        for (int j = 0; j < n; j++) {
            if (o1[j] < 0 && (b + o1[j] >= s && b + o1[j] <= t)) {
                k++;
            }
        }
        System.out.println(k);

    }
}
