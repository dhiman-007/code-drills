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

class sockmerchant {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        ArrayList x = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (!x.contains(a[i])) {
                x.add(a[i]);
            }
        }
        int c = 0;
        for (int i = 0; i < x.size(); i++) {
            int xx = Collections.frequency(Arrays.asList(a), x.toArray()[i]);
            if (xx >= 2) {
                c = c + xx / 2;
            }
        }
        System.out.println(c);
    }
}
