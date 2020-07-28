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

class beautifuldaysATmovies {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        int j = s.nextInt();
        int k = s.nextInt();

        int c = 0;
        for (int h = i; h <= j; h++) {
            String g = Integer.toString(h);
            int x = Integer.parseInt(g);
            String gg = new StringBuffer(g).reverse().toString();
            int y = Integer.parseInt(gg);
            if (Math.abs(x - y) % k == 0) {
                c++;
            }
        }
        System.out.println(c);
    }

}
