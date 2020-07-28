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

class jumpingonthecloud {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int i = 0, c = 0;
        if (n == 2) {
            System.out.println(1);
        } else {
            while (i < n - 2) {

                if (a[i + 2] == 0) {
                    c++;
                    i = i + 2;
                } else {
                    i++;
                    c++;
                }
                if (i >= n - 3) {
                    if (i == n - 1) {
                        break;
                    } else {
                        c++;
                        break;
                    }

                }
            }
            System.out.println(c);
        }
    }
}
