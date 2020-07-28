/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.String;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class Sq {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        int r = 0;
        for (r = 0; r < t; r++) {
            String s = in.nextLine();
            int n = s.length(), i, j = 0, k, l;
            String rev = new StringBuffer(s).reverse().toString();
            boolean res = false;
            char ch[] = s.toCharArray();
            char ch1[] = rev.toCharArray();
            for (i = 0; i < n - 1; i++) {
                if (Math.abs(ch[i + 1] - ch[i]) == Math.abs(ch1[i + 1] - ch1[i])) {
                    res = true;
                } else {
                    res = false;
                    break;
                }
            }

            if (res == true) {
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }

    }
}
