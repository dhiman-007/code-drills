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

class change {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String s1 = s.nextLine();

        char ch[] = s1.toCharArray();
        n = ch.length;
        int x = 1, c = 0;
        for (int i = x; i < n - 1; i++) {
            // System.out.println(ch[i]+"@");
            if (ch[i] == '1') {
                if (ch[i - 1] == '0' && ch[i + 1] == '0') {
                    ch[i + 1] = '1';
                    c++;
                    x = i + 2;

                }
            }
        }
        System.out.println(c);

    }
}
