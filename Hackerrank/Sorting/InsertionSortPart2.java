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

class insertionsort2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            if (a[i] > a[i + 1]) {
                int x = i + 1;
                for (int j = x; j > 0; j--) {
                    if (a[j] < a[j - 1]) {
                        int y = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = y;
                    }
                }
            }
            for (int k = 0; k < n; k++) {
                System.out.print(a[k] + " ");
            }
            System.out.println("");
        }
    }
}
