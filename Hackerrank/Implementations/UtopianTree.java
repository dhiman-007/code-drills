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

class utopiantree {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        while (q-- > 0) {
            int n = s.nextInt();
            int sum = 0;
            for (int i = 0; i < n + 1; i++) {
                if (i % 2 == 0) {
                    sum = sum + 1;
                } else {
                    sum = (sum * 2);
                }
                // System.out.println(i+" "+sum);
            }
            System.out.println(sum);

        }
    }

}
