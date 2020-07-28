/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.search;

/**
 *
 * @author Dhimam
 */
import java.util.*;

class missingnumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer a[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int p = s.nextInt();
        Integer b[] = new Integer[p];
        for (int i = 0; i < p; i++) {
            b[i] = s.nextInt();
        }
        List<Integer> x = new ArrayList();
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < p; i++) {
            if (!x.contains(b[i])) {
                x.add(b[i]);
            }
        }
        //System.out.println(x.toString());
        for (int i = 0; i < x.size(); i++) {
            int xy = Collections.frequency(Arrays.asList(b), x.toArray()[i]);
            //System.out.println(xy+"s");

            int yz = Collections.frequency(Arrays.asList(a), x.toArray()[i]);
            //System.out.println(yz+"sx");
            //System.out.println("");
            if (yz == 0) {
                ans.add(x.get(i));
            } else if (xy != yz) {
                ans.add(x.get(i));
            }
        }
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}
