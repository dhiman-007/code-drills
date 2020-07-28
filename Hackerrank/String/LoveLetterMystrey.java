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

class TheLoveLetterMystery {

    static int calc(String s1) {
        int sum = 0;
        String b = s1.substring(0, s1.length() / 2);
        String a = s1.substring(s1.length() / 2, s1.length());
        int i = b.length() - 1;
        int j = 0;
        String rev = new StringBuffer(s1).reverse().toString();
        if (rev.equals(s1)) {
            return sum;
        }
        if (s1.length() % 2 == 0 && rev.equals(s1) == false) {
            while (i >= 0 && j <= s1.length() - 1) {
                sum = sum + Math.abs(b.charAt(i) - a.charAt(j));
                i--;
                j++;
            }
        } else if (s1.length() % 2 != 0 && rev.equals(s1) == false) {
            b = s1.substring(0, s1.length() / 2);
            a = s1.substring(s1.length() / 2 + 1, s1.length());
            while (i >= 0 && j <= s1.length() - 1) {
                sum = sum + Math.abs(b.charAt(i) - a.charAt(j));
                i--;
                j++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        while (n-- > 0) {
            String s1 = s.nextLine();
            System.out.println(calc(s1));

        }
    }
}
