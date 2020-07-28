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

class nexttest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int z = 0;
        int b[] = new int[3000];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = 1;
        }
        for (int i = 0; i < 3000; i++) {
            if (b[i] == 0) {
                z = 1;
                System.out.println(i + 1);
                break;
            } else {
                if (i == n - 1) {
                    System.out.println(n + 1);
                    break;
                }
            }
        }

    }
}
