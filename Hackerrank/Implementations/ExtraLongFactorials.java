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
import java.math.BigInteger;

class extralongfactorials {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        BigInteger b1;
        b1 = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            b1 = (b1.multiply(BigInteger.valueOf(i)));
        }
        System.out.println(b1);
    }
}
