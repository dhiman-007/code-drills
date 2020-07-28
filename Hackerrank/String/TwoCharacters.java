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

class twocharacterssfinal //  time limit problem resolved 
{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String s1 = s.nextLine();
        // char[] chars = s1.toCharArray();
        LinkedHashSet<Character> x = new LinkedHashSet<Character>();
        for (int i = 0; i < s1.length(); i++) {

            x.add(s1.charAt(i));

        }
        int max = 0;

        Character[] ch = x.toArray(new Character[x.size()]);
        // to convert a linked hash set into its equivalent
        // character type array
        // System.out.println(ch.toString());
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                char a = ch[i];
                char b = ch[j];
                String s2 = "";
                for (int k = 0; k < s1.length(); k++) {
                    if (s1.charAt(k) == a || s1.charAt(k) == b) {
                        s2 += s1.charAt(k);
                    }
                }
                // System.out.println(s2);
                boolean res = true;
                for (int k = 0; k < s2.length() - 1; k++) {
                    if (s2.charAt(k) == s2.charAt(k + 1)) {
                        res = false;
                        break;
                    }
                }
                if (res == true) {
                    if (s2.length() > max) {
                        max = s2.length();
                    }
                }
            }
        }
        System.out.println(max);
    }
}
