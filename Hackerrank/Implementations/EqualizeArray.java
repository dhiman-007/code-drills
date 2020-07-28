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

class Equalizearray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        Integer a[] = new Integer[n];
        int max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        ArrayList x = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            if (!x.contains(a[i])) {
                x.add(a[i]);
            }
        }
        for (int i = 0; i < x.size(); i++) {
            int aa = Collections.frequency(Arrays.asList(a), x.toArray()[i]);
            if (aa > max) {
                max = aa;
            }
        }
        System.out.println(n - max);

    }
}
