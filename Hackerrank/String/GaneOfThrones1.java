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

class gameofthrones {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        int x = 256;
        int c = 0;
        int a[] = new int[x];
        Arrays.fill(a, 0);
        for (int i = 0; i < s1.length(); i++) {
            a[(int) s1.charAt(i)]++;
        }
        for (int i = 0; i < x; i++) {
            if (a[i] % 2 != 0) {
                c++;
            }
        }
        if (c > 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }

}
