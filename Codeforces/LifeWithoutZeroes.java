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

class life {

    static String remove(String x) {
        String W_Z = "";
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != '0') {
                W_Z += "" + x.charAt(i);
            }
        }
        return W_Z;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        long y = s.nextLong();
        long z = x + y;

        String m1 = Long.toString(x);
        String m2 = Long.toString(y);
        String m3 = Long.toString(z);

        if (Long.parseLong(remove(m1)) + Long.parseLong(remove(m2)) == Long.parseLong(remove(m3))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
