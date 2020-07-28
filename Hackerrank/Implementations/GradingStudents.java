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

class grade1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0) {
            int g = s.nextInt();
            int y = g;
            while (g % 5 != 0) {
                g++;
            }
            int xx = g;
            if (y < 38) {
                System.out.println(y);
            } else if (xx - y < 3) {
                System.out.println(xx);
            } else if (xx - y == 3 || xx - y > 3) {
                System.out.println(y);
            }

        }
    }
}
