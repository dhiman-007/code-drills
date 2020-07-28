/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Sorting;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class closestnumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int min = a[1] - a[0];
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] < min) {
                min = a[i + 1] - a[i];

            }
        }
        // System.out.println(min);
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] == min) {
                System.out.print(a[i] + " " + a[i + 1] + " ");
            }
        }
    }
}
