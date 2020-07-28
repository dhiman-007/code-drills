/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Arrays;

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

class arr1 {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sum = 0, max = 0, min = 99999999, c = 0;
        for (int i = 0; i <= arr.length - 3; i++) {
            for (int j = 0; j <= arr.length - 3; j++) {
                sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum < 0) {
                    c++;
                    if (Math.abs(sum) < min) {
                        min = Math.abs(sum);
                    }

                }
                if ((sum) > max && sum > 0) {
                    max = sum;
                }
                sum = 0;
            }
        }
//System.out.println(c);
        if (c == 16) {
            return -1 * min;
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
