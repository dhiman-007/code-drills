/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

/**
 *
 * @author Dhimam
 */
// Old skool mitran di vibe
import java.util.*;
class LAndS {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int m = 0;
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if (i % 2 != 0) {
                    System.out.print("#");
                } else if (m == 0) {
                    if (j == y) {
                        m = 1;
                        System.out.print("#");
                    } else {
                        System.out.print(".");
                    }
                } else if (m == 1) {
                    if (j == 1) {
                        System.out.print("#");
                    } else {
                        if (j == y) {
                            m = 0;
                        }
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}
