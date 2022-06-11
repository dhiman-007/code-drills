import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/

// Missed by few second due to syntax
public class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            String vector = in.nextLine();
            String x[] = vector.split(" ");
            num.add(Integer.parseInt(x[0].substring(0, x[0].length()-1)));
            num.add(Integer.parseInt(x[1].substring(0, x[1].length()-1)));
            num.add(Integer.parseInt(x[2].substring(0, x[2].length()-1)));
        }

        System.out.println((num.get(0) + num.get(3)) + "i" + " " 
        + (num.get(1) + num.get(4)) + "j" + " "+ (num.get(2) + num.get(5)) + "k");

        String x = (num.get(0) + num.get(3)) + "i" + " " 
        + (num.get(1) + num.get(4)) + "j" + " "+ (num.get(2) + num.get(5)) + "k";

        String ans[] = x.split(" ");

        System.out.println((int)Math.sqrt((int)(Math.pow(Integer.parseInt(ans[0].substring(0, ans[0].length()-1)), 2)) 
                                          + (int)(Math.pow(Integer.parseInt(ans[1].substring(0, ans[1].length()-1)), 2))
                                          + (int)(Math.pow(Integer.parseInt(ans[2].substring(0, ans[2].length()-1)), 2))));

    }
}
