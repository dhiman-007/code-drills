/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Sorting;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class countingsortmymethod {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer a[] = new Integer[n];
        ArrayList x = new ArrayList();
        int xx = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            x.add(a[i]);
        }
        for (int i = 0; i < 100; i++) {
            xx = 0;
            xx = Collections.frequency(Arrays.asList(a), i);
            System.out.print(xx + " ");
        }
    }
}
