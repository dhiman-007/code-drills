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

class migrartorybird {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Long a[] = new Long[n];
        long max = 0;
        long y = 0;
        LinkedHashSet<Long> x = new LinkedHashSet<Long>();
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextLong();
        }
        for (int x1 = 0; x1 < a.length; x1++) {
            x.add(a[x1]);
        }
        for (int i = 0; i < x.size(); i++) {
            long x2 = Collections.frequency(Arrays.asList(a), (Long) x.toArray()[i]);  //important notation
            //System.out.println(x2+"__");
            if (x2 >= max) {
                if (x2 == max) {
                    if ((Long) x.toArray()[i] < y) {
                        max = x2;
                        y = (Long) x.toArray()[i];
                    }
                } else {
                    max = x2;
                    y = (Long) x.toArray()[i];
                    // System.out.println(y+"))");

                }
            }
            // System.out.println(max+"+"+y);
        }
        System.out.println(y);
    }
}
