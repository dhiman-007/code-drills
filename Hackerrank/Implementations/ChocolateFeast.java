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

class choclate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();

            int totalChoc = n / c;
            int totalWrappers = totalChoc;
            int freeChocs = 0;
            while (m <= totalWrappers) {
                int wrapperTogive = totalWrappers - (totalWrappers % m);

                freeChocs = totalWrappers / m;

                totalWrappers = (totalWrappers - wrapperTogive) + freeChocs;

                totalChoc = totalChoc + freeChocs;

            }

            System.out.println(totalChoc);

        }
    }
}
