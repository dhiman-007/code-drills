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

class beautifultriplets {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = 0;
        int d = s.nextInt();
        s.nextLine();
        int a[] = new int[n];
        boolean res = true;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int x = a[i];
            for (int j = i + 1; j < n; j++) {
                if (x + d == a[j]) {
                    int yy = j;
                    for (int k = j; k < n; k++) {
                        if (a[yy] + d == a[k]) {
                            c++;
                            res = false;
                            break;
                        }

                    }
                    if (res == false) {
                        break;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
