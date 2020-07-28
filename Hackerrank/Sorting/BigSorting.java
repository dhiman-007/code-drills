/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Sorting;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class bigsorting {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String s1[] = new String[n];
        for (int i = 0; i < n; i++) {
            s1[i] = s.next();
        }
        Arrays.sort(s1, new Comparator<String>() {
            public int compare(String a, String b) {
                if (a.length() == b.length()) {
                    return a.compareTo(b);
                }
                return a.length() - b.length();
            }
        });
        for (String p : s1) {
            System.out.println(p);
        }
    }
}
