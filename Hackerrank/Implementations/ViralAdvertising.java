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

class viraladvertising {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int shared = 5;
        int cumulative = 0;
        for (int i = 1; i <= n; i++) {
            int liked = shared / 2;
            cumulative = cumulative + liked;
            shared = liked * 3;

        }
        System.out.println(cumulative);
    }

}
