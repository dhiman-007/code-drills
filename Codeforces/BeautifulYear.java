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

class MyClass {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int z = 0;
        int a[] = new int[10];
        while (true) {
            n++;
            z = 0;

            String chk = String.valueOf(n);
            for (int i = 0; i < chk.length(); i++) {
                a[chk.charAt(i) - '0']++;
            }

            for (int i = 0; i < 10; i++) {
                if (a[i] > 1) {
                    z++;
                    break;
                }
            }

            if (z == 0) {
                System.out.println(n);
                break;
            }

            Arrays.fill(a, 0);
        }
    }
}
