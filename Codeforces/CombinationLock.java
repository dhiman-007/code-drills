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

class Lock {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        int x1 = 0, x2 = 0, count = 0;
        for (int i = 0; i < n; i++) {
            x1 = Integer.parseInt("" + s1.charAt(i));
            x2 = Integer.parseInt("" + s2.charAt(i));
            if (x1 > x2) {
                count += Math.min(x1 - x2, (10 - x1 + x2));
            } else if (x1 < x2) {
                count += Math.min(x2 - x1, (x1 + 10 - x2));
            }
        }
        System.out.println(count);
    }
}
