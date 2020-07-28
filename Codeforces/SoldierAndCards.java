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

public class Stackkk {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k1 = s.nextInt();
        int a[] = new int[k1];
        for (int i = 0; i < k1; i++) {
            a[i] = s.nextInt();
        }
        Stack<Integer> s1 = new Stack<Integer>();
        for (int i = k1 - 1; i >= 0; i--) {
            s1.push(a[i]);
        }
        int k2 = s.nextInt();
        int b[] = new int[k2];
        for (int i = 0; i < k2; i++) {
            b[i] = s.nextInt();
        }
        Stack<Integer> s2 = new Stack<Integer>();
        for (int i = k2 - 1; i >= 0; i--) {
            s2.push(b[i]);
        }
        int c = 0;
        int z = 1;
        while (true) {
            c++;
            if (s1.peek() < s2.peek()) {
                int x = s1.peek();
                s1.pop();
                s2.add(0, x);
                s2.add(0, s2.peek());
                s2.pop();
            } else {
                int y = s2.peek();
                s2.pop();
                s1.add(0, y);
                s1.add(0, s1.peek());
                s1.pop();
            }
            if (s1.isEmpty()) {
                z = 1;
                break;
            } else if (s2.isEmpty()) {
                z = 2;
                break;
            }
            if (c > 100000) {
                z = -1;
                break;
            }
        }
        if (z == -1) {
            System.out.println(-1);
        } else {
            System.out.print(c + " ");
            if (z == 1) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
    }

}
