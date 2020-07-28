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

import java.util.*;

class h3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int v1 = s.nextInt();
        int x2 = s.nextInt();
        int v2 = s.nextInt();
        boolean res = false;
        int sum = x1;
        int sum1 = x2;
        while (true) {
            if ((v2 - v1) != 0) {
                if (x2 > x1 && v2 > v1 || (x2 - x1) % (v2 - v1) != 0) {
                    res = false;
                    break;

                }
                sum = sum + v1;
                sum1 = sum1 + v2;

                if (sum == sum1) {
                    res = true;
                    break;
                }

            } else {
                res = false;
                break;
            }
        }
        if (res == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
