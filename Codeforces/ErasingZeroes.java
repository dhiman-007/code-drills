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

class GameZero {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- > 0) {
            String s1 = s.nextLine();
            int count = 0, z = 0, m = 0, temp = 0;
            for (int i = 0; i < s1.length() - 1; i++) {
                for (int j = i + 1; j < s1.length(); j++) {
                    if (s1.charAt(i) == '1' && s1.charAt(j) == '0') {
                        m++;
                        count++;
                        temp = m;
                    } else {
                        i = j - 1;
                        m = 0;
                        break;
                    }
                }
            }
            if (s1.charAt(s1.length() - 1) == '0') {
                System.out.println(count - temp);
            } else {
                System.out.println(count);
            }
        }
    }
}
