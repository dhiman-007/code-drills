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

public class DayOfProgrammer {

    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        int n = h.nextInt();
        int a1[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int a2[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int i, sum = 0;
        boolean res = false;
        int d = 0;
        int d1 = 0;
        if (n >= 1918 && n <= 2700) {
            if (n == 1918) {
                sum = -13;
            }
            if (n % 400 == 0 || n % 4 == 0 && n % 100 != 0) {
                res = true;
            } else {
                res = false;
            }
        } else if (n <= 1917 && n >= 1700) {
            if (n % 4 == 0) {
                res = true;
            } else {
                res = false;
            }
        }

        //   System.out.println(res);
        if (res == false) {
            for (i = 0; i < 8; i++) {
                sum = sum + a1[i];
            } //System.out.println(sum);
            d = 256 - sum;
            System.out.println(d + "." + 0 + (i + 1) + "." + n);
        } else {
            for (i = 0; i < 8; i++) {
                sum = sum + a2[i];
            }
            d = 256 - sum;
            System.out.println(d + "." + 0 + (i + 1) + "." + n);
        }

    }
}
