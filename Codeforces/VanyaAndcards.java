/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class VanysANDCards {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        int y = Math.abs(sum);
        //System.out.println(Math.abs(sum));
        if (y == 0) {
            System.out.println(0);
        } else if (y > x) {
            if (y % x == 0) {
                System.out.println(y / x);
            } else {
                System.out.println((y / x) + 1);
            }
        } else {
            System.out.println(1);
        }
    }
}
