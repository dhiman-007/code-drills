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

class GemStone {

    static int MAX_CHAR = 26;

    public static void commonCharacters(String str[],
            int n) {
        int c = 0;
        Boolean[] prim = new Boolean[MAX_CHAR];
        Arrays.fill(prim, new Boolean(true));

        for (int i = 0; i < n; i++) {
            Boolean[] sec = new Boolean[MAX_CHAR];
            Arrays.fill(sec, new Boolean(false));
            for (int j = 0; j < str[i].length(); j++) {

                if (prim[str[i].charAt(j) - 'a']) {
                    sec[str[i].charAt(j) - 'a'] = true;
                }
            }

            System.arraycopy(sec, 0, prim, 0, MAX_CHAR);
        }

        for (int i = 0; i < 26; i++) {
            if (prim[i]) {
                c++;

            }
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String str[] = new String[n];
        for (int i = 0; i < str.length; i++) {
            String s1 = s.nextLine();
            str[i] = s1;
        }

        commonCharacters(str, n);
    }
}
