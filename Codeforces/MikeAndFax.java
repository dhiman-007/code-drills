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

class MikeANDFax {

    static Boolean check(String s2) {
        if (new StringBuffer(s2).reverse().toString().equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int n = s.nextInt();
        int l = s1.length();
        int x = l / n, c = 0, i = 0;
        if (l < n) {
            System.out.println("NO");
            return;
        }
        for (i = 0; i <= l - x; i++) {
            String w = s1.substring(i, i + x);
            if (check(w)) {
                c++;
            }
            i += x - 1;
        }
        //System.out.println(i);
        //System.out.println(c);
        if (c == n && l - i == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
