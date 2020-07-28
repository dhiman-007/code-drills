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

class TwoStrings {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        while (n-- > 0) {
            String s1 = s.nextLine();
            String s2 = s.nextLine();
            int a[] = new int[26];
            int y[] = new int[26];
            boolean res = false;
            for (int i = 0; i < s1.length(); i++) {
                a[s1.charAt(i) - 97]++;
            }
            for (int i = 0; i < s2.length(); i++) {
                y[s2.charAt(i) - 97]++;
            }
            //System.out.println(Arrays.toString(a));
            for (int i = 0; i < 26; i++) {
                if (a[i] >= 1 && y[i] >= 1) {

                    res = true;
                    break;
                }

            }
            if (res == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

}
