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

class findthedigit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        while (q-- > 0) {
            int n = s.nextInt();
            int num = n;
            int d, c = 0;
            while (num > 0) {
                d = num % 10;
                if (d != 0) {
                    if (n % d == 0) {
                        c++;
                    }
                }
                num = num / 10;
            }
            System.out.println(c);
        }
    }

}
