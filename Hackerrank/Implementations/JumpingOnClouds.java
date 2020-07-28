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

class jumpingoncloudrevisited {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int e = 100;
        for (int i = 0; i < n; i = i + k) {

            if (a[i] == 1) {
                e = e - 3;
            } else {
                e = e - 1;
            }

            // System.out.println(e);
        }
        System.out.println(e);
    }

}
