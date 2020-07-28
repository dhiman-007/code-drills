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

class kaperkar {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long l = s.nextLong();
        long u = s.nextLong();
        int z = 0;
        for (long i = l; i <= u; i++) {
            long n1 = i;
            //System.out.println(n1);
            int d = String.valueOf(n1).length();//System.out.println(d);
            if (d == 1) {
                if (n1 == 1 || n1 == 9) {
                    System.out.print(n1 + " ");
                }
            } else {
                long sq = n1 * n1;//System.out.println(sq);
                String bb = String.valueOf(sq);//System.out.println(bb);
                String right = bb.substring(bb.length() - d, bb.length());//System.out.println(right);
                String left = bb.substring(0, bb.length() - d);//System.out.println(left);
                long ans = Long.parseLong(left) + Long.parseLong(right);//System.out.println(ans);
                if (ans == n1) {
                    z = 1;
                    System.out.print(ans + " ");
                }
            }

        }
        if (z == 0) {
            System.out.println("INVALID RANGE");
        }
    }
}
