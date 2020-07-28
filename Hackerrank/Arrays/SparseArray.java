/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Arrays;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class sparseArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int c = 0;
        String s1[] = new String[n];
        for (int i = 0; i < n; i++) {
            s1[i] = s.nextLine();
        }
        int q = s.nextInt();
        s.nextLine();
        String s2[] = new String[q];
        for (int i = 0; i < q; i++) {
            s2[i] = s.nextLine();
        }
        for (int i = 0; i < s2.length; i++) {
            for (int j = 0; j < s1.length; j++) {
                if (s2[i].equals(s1[j]) == true) {
                    c++;
                }
            }
            System.out.println(c);
            c = 0;
        }
    }
}
