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

class Mish {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum1 = 0, sum2 = 0;
        while (n-- > 0) {
            int mis = s.nextInt();
            int chr = s.nextInt();
            if (mis > chr) {
                sum1++;
            } else if (chr > mis) {
                sum2++;
            }
        }
        if (sum1 == sum2) {
            System.out.println("Friendship is magic!^^");
        } else if (sum1 > sum2) {
            System.out.println("Mishka");
        } else {
            System.out.println("Chris");
        }
    }
}
