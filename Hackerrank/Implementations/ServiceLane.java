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

class servicelane {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int t = s.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        while (n-- > 0) {
            int min = 99999999;
            int r1 = s.nextInt();
            int r2 = s.nextInt();
            for (int i = r1; i <= r2; i++) {
                if (a[i] < min) {
                    min = a[i];
                }
            }
            System.out.println(min);
        }
    }
}
