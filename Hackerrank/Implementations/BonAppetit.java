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

class BonAppetit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int refuse = s.nextInt();
        int a[] = new int[n];

        s.nextLine();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int charge = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (i != refuse) {
                sum = sum + a[i];
            }
        }
        // System.out.println(sum);
        int h = sum / 2;
        if (h != charge) {
            System.out.println(charge - h);

        } else {
            System.out.println("Bon Appetit");

        }

    }
}
