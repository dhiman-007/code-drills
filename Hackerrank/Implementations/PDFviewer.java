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

class pdf {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[26];
        int y = 0;
        for (int i = 0; i < 26; i++) {
            a[i] = s.nextInt();
        }
        s.nextLine();
        String s1 = s.nextLine();
        int max = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            // System.out.println(c);
            int x = (int) c;
            y = x - 96;
            // System.out.println(y);
            if (a[y - 1] > max) {
                max = a[y - 1];
            }
            // System.out.println(max);
        }

        System.out.println(max * s1.length());

    }
}
