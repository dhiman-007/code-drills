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

class MarsExploration {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "";
        int count = 0;
        int x = s1.length() / 3;
        while (x-- > 0) {
            s2 = s2 + "SOS";
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
            }

        }
        System.out.println(count);

    }

}
