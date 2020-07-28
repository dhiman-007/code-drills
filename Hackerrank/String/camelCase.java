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

class CamelCase {

    static int count(String s1) {
        s1 = s1 + " ";
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if ((c >= 65 && c <= 91) || c == ' ') {
                counter++;
            }

        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        System.out.println(count(s1));
    }
}
