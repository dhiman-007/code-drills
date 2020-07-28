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

class Game {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String x = s.nextLine();
        int count = 0, max = 0;
        String str = "";
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < n - 1; i++) {
            list.add(x.substring(i, i + 2));
        }
        //System.out.println(list.toString());
        ArrayList<String> y = new ArrayList<String>();
        for (int j = 0; j < list.size(); j++) {
            if (!y.contains(list.get(j))) {
                y.add(list.get(j));
            }
        }
        for (int j = 0; j < y.size(); j++) {
            count = 0;
            for (int k = 0; k < list.size(); k++) {
                if (y.get(j).equals(list.get(k))) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    str = y.get(j);
                }
            }
        }
        System.out.println(str);
    }
}
