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

class panagrams {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s3 = s1.toLowerCase();
        String s2 = "abcdefghijklmnopqrstuvwxyz";
        ArrayList x = new ArrayList();
        boolean res = true;
        String aa = "";
        for (int i = 0; i < s3.length(); i++) {
            if (!x.contains(s3.charAt(i)) && s3.charAt(i) != 32) {
                x.add(s3.charAt(i));
            }
        }
        //System.out.println(x.toString());
        Collections.sort(x);
        // System.out.println(x.toString());
        for (int i = 0; i < x.size(); i++) {
            aa = aa + x.get(i);
        }
        //System.out.println(aa);
        if (aa.equals(s2)) {
            res = false;
        } else {
            res = true;
        }
        if (res == false) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
    }

}
