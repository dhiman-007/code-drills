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

class aayush {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int max = a[0];
        int k = s.nextInt();
        int h;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        if (max > k) {
            h = max - k;
            System.out.println(h);
        } else {
            System.out.println(0);
        }
    }
}
