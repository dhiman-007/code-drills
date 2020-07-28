/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Stack;

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

class balanced {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> x = new Stack<Character>();
        String a = "({[";
        String b = ")}]";
        x.add(s.charAt(0));
        int z = 0;
        for (int i = 1; i < s.length(); i++) {
            if (x.isEmpty() && b.contains("" + s.charAt(i))) {
                z = 1;
                break;
            }
            if (a.contains("" + s.charAt(i))) {
                x.push(s.charAt(i));
            } else if (b.contains("" + s.charAt(i)) && x.peek() != a.charAt(b.indexOf(s.charAt(i)))) {
                z = 1;
                break;
            } else {
                x.pop();
            }
            if (z == 1) {
                break;
            }

        }
        System.out.println(x.toString());
        if (z == 0 && x.size() == 0) {
            System.out.println("YES");
            return "YES";
        } else {
            System.out.println("NO");
            return "NO";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
