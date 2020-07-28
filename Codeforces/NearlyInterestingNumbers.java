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

class MyClasses {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        while (true) {
            int k = n;
            while (n > 0) {
                int d = n % 10;
                sum += d;
                n /= 10;
            }
            if (sum % 4 == 0) {
                System.out.println(k);
                break;
            } else {
                k++;
                n = k;
                sum = 0;
            }
        }
    }
}
