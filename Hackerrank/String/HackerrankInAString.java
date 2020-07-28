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

class hackerranks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        s.nextLine();
        while (q-- > 0) {
            String s1 = s.nextLine().toLowerCase();
            String s2 = "hackerrank";
            int xx = 0;
            String s3 = "";
            for (int i = 0; i < s2.length(); i++) {
                for (int j = xx; j < s1.length(); j++) {
                    if (s2.charAt(i) == s1.charAt(j)) {
                        s3 = s3 + s2.charAt(i);
                        xx = j + 1;
                        break;
                    }
                }
            }
            if (s3.length() == s2.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
