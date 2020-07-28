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

class pickingnumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int c = 0;
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            c = 0;
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(a[i] - a[j]) == 0 || Math.abs(a[i] - a[j]) == 1) {
                    c++;
                }
            }
            //System.out.println(c+"###");
            if (c > max) {
                max = c;
            }
        }
        System.out.println(max + 1);
    }

}
