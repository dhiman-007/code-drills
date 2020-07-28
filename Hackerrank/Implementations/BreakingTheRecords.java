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

class breakrecord {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int c = 0, c1 = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int max = a[0];
        int min1 = a[0];
        for (int i = 0; i < n - 1; i++) {
            // System.out.println(a[i+1]);
            if (a[i + 1] > max) {
                c++;//System.out.println(c+"@@@@@W");
                max = a[i + 1];
            } else if (a[i + 1] < min1) {
                c1++;
                min1 = a[i + 1];
            }
        }

        System.out.println(c + " " + c1);
    }

}
