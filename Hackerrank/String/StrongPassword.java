/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.String;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class strongPassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine();
        boolean l, u, d, s;
        l = u = d = s = false;
        int c = 0;
        for (int i = 0; i < n; i++) {
            char ch = s1.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                l = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                u = true;
            } else if (ch >= '0' && ch <= '9') {
                d = true;
            } else {
                s = true;
            }
        }
        if (l) {
            c++;
        }
        if (u) {
            c++;
        }
        if (d) {
            c++;
        }
        if (s) {
            c++;
        }
        int ans = 4 - c;
        if ((ans + n) >= 6) {
            System.out.println(ans);
        } else {
            System.out.println(6 - n);
        }
    }
}
