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
class Dman {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0) {
            int buns = s.nextInt();
            int hamPatti = s.nextInt();
            int chickenPatti = s.nextInt();
            int hamPrice = s.nextInt();
            int chickenPrice = s.nextInt();

            if ((hamPatti * 2) + (chickenPatti * 2) < buns) {
                System.out.println((hamPatti * hamPrice) + (chickenPatti * chickenPrice));
            } else {
                int max = Math.max(hamPrice, chickenPrice);
                int bun = buns / 2;
                if (max == hamPrice) {
                    if (hamPatti > bun) {
                        System.out.println(bun * hamPrice);
                    } else {
                        System.out.println((max * hamPatti) + ((bun - hamPatti) * chickenPrice));
                    }
                } else if (max == chickenPrice) {
                    if (chickenPatti > bun) {
                        System.out.println(bun * chickenPrice);
                    } else {
                        System.out.println((max * chickenPatti) + ((bun - chickenPatti) * hamPrice));
                    }
                }
            }

        }
    }
}
