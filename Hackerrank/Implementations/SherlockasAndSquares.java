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

class sherlocksquares {  //most efficient way 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        s.nextLine();
        while (q-- > 0) {
            int a = s.nextInt();
            int b = s.nextInt();

            System.out.println((int) Math.floor(Math.sqrt(b)) - (int) Math.ceil(Math.sqrt(a)) + 1);

        }
    }

}
