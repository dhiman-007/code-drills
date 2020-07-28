/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Implementations;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class encryption3 // 21 test cases 24
{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = "", s4 = "", s5 = "";
        int dd = 0, ddd = 0;
        int i = 0;
        int len = 0, h = 0;
        int colum = 0;
        s1 = s1.replaceAll(" ", "");
        int x = s1.length();
        //System.out.println(x);
        int row = (int) Math.floor(Math.sqrt(x));
        if (row * row == x) {
            colum = row;
        } else {
            colum = row + 1;
            while (!((row * colum) > x)) {
                row = row + 1;
            }
        }
        //System.out.println(row);
        //System.out.println(colum);
        int x1 = 0, p = colum;

        String a[] = new String[row];
        for (i = 0; i < a.length; i++) {
            for (int j = x1; j < p; j++) {
                if (i != a.length - 1) {
                    s2 = s2 + s1.charAt(j);
                } else {
                    s2 = s1.substring(p - colum, s1.length());
                }
            }
            a[i] = s2;
            x1 = x1 + colum;
            p = p + colum;
            s2 = "";
        }

        Character ch[][] = new Character[a.length][];
        int t = 0;
        for (i = 0; i < a.length; i++) {
            ch[i] = new Character[a[i].length()];
            for (int j = 0; j < a[i].length(); j++) {
                ch[i][j] = a[i].charAt(j);
                t++;
            }
        }
        // System.out.println(Arrays.deepToString(ch)+t);
        i = 0;
        int c = 0, j = 0;
        while (c != t) {
            if (i <= a[j].length() - 1 && ch[j][i] != null) {
                c++;
                System.out.print(ch[j][i]);
            }
            if (j == a.length - 1) {
                System.out.print(" ");
                j = -1;
                i++;
            }
            j++;
        }
    }
}
