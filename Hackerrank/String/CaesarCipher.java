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
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

 class caesar {

    // Complete the caesarCipher function below.
    static String caesarCipher(String s, int k) {
        char c[] = s.toCharArray();
        int x = 0;
        for (int i = 0; i < c.length; i++) {
            x = (int) c[i];
            if (x >= 97 && x <= 122 || x >= 65 && x <= 90) {
                if (x >= 97 && x <= 122) {
                    if (k > 26) {
                        k = k % 26;
                    }
                    if (x + k > 122) {
                        x = k - (122 - x);
                        c[i] = (char) (97 + x - 1);
                    } else {
                        c[i] = (char) (x + k);
                    }
                } else {
                    if (k > 26) {
                        k = k % 26;
                    }
                    if (x + k > 90) {
                        x = k - (90 - x);
                        c[i] = (char) (65 + x - 1);
                    } else {
                        c[i] = (char) (x + k);
                    }

                }
            }
        }

        return String.valueOf(c);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
