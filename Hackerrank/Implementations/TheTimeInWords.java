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

class TimeInWords {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hh = s.nextInt();
        int mm = s.nextInt();
        String time[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
            "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven",
            "twenty eight", "twenty nine"};
        if (mm == 0) {
            System.out.println(time[hh - 1] + " " + "o'" + " " + "clock");
        } else if (mm < 30 && mm != 15 && hh != mm) {
            System.out.println(time[mm - 1] + " " + "minutes past" + " " + time[hh - 1]);
        } else if (mm == 15) {
            System.out.println("quarter past" + " " + time[hh - 1]);
        } else if (mm == 30) {
            System.out.println("half past" + " " + time[hh - 1]);
        } else if (mm == 45) {
            System.out.println("quarter to" + " " + time[hh]);
        } else if (mm == 45 && hh == 12) {
            System.out.println("quarter to" + time[0]);
        } else if (mm > 30 && hh != 12) {
            System.out.println(time[60 - mm - 1] + " " + "minutes to" + " " + time[hh]);
        } else if (hh == 12 && mm > 30) {
            System.out.println(time[60 - mm - 1] + " " + "minutes to" + " " + time[0]);
        } else if (hh == mm) {
            System.out.println(time[hh - 1] + " " + "minute past" + " " + time[hh - 1]);
        }

    }
}
