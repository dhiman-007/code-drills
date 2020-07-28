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

class sequenceequation {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = 1, x = 0;
        int a[] = new int[n];
        int y = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] == i) {
                    x = j + 1;
                    break;
                }
            }
            for (int kx = 0; kx < n; kx++) {
                if (a[kx] == x) {
                    System.out.println(kx + 1);
                    break;
                }
            }
        }
    }

}
