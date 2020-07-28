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

class quick {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        ArrayList x = new ArrayList();
        ArrayList x1 = new ArrayList();
        for (int i = 1; i < n; i++) {
            if (a[i] < a[0]) {
                x.add(a[i]);
            } else {
                x1.add(a[i]);
            }
        }
        for (int i = 0; i < x.size(); i++) {
            System.out.print(x.get(i) + " ");
        }
        System.out.print(a[0] + " ");
        for (int i = 0; i < x1.size(); i++) {
            System.out.print(x1.get(i) + " ");
        }
    }
}
