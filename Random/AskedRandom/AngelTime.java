
import java.util.*;
class AngelTime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String startTime = s.nextLine(); // In this format HH:MM
        String endTime = s.nextLine();
        int h1 = Integer.valueOf(startTime.split(":")[0]), m1 = Integer.valueOf(startTime.split(":")[1]);
        int h2 = Integer.valueOf(endTime.split(":")[0]), m2 = Integer.valueOf(endTime.split(":")[1]);
        if(h1 < 1 || h2 > 23 || m1 < 0 || m1 > 59 || m2 < 0 || m2 > 59) return;
        int count = 0; String angelTime = "";
        for(int i = h1 ; i <= h2; i++ ) {
            if (i != 6 && i != 7 && i != 8 && i != 9
            ) {
                if (i == h1 || i == h2) {
                    if (i == h1 && m1 <= h1) {count++; angelTime += String.valueOf(i).length() == 1 ? (i + ":" + i + "" + i + " ") : (i + ":" + i + " ");}
                    if (i == h2 && m2 >= h2) {count++; angelTime += String.valueOf(i).length() == 1 ? (i + ":" + i + "" + i + " ") : (i + ":" + i + " ");}
                } else {count++;angelTime += String.valueOf(i).length() == 1 ? (i + ":" + i + "" + i + " ") : (i + ":" + i + " ");}
            }
        }
        System.out.println(count);
        System.out.println(angelTime);
    }
}
