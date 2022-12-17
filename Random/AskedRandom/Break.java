// https://edabit.com/challenge/ihrD5RjtD34ThEb4z
import java.util.Scanner;
public class Breaks {
    public static void main(String[] args) {
        char ch[][] = new char[5][5];
        int charInitAscii = 65;

        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (i == 2 && j == 0) charInitAscii += 1;
                ch[i][j] = (char) (charInitAscii++);
            }
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String output = "";

        for (char c : input.toCharArray()) {
            String cordStringArr[] = getXAndYCord(ch, c).split(" ");
            int xCord = Integer.parseInt(cordStringArr[0]);
            int yCord = Integer.parseInt(cordStringArr[1]);
            for (int l = 0; l < xCord; l++) output += ".";
            output += " ";
            for (int k = 0; k < yCord; k++) output += ".";
            output += " ";
        }
        
        System.out.println(output);
    }

    private static String getXAndYCord(char[][] ch, char c) {
        int kXCord = 1, kYCord = 3;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (c == 'K') return kXCord + " " + kYCord;
                if (ch[i][j] == c) return (i + 1) + " " + (j + 1);
            }
        }
        return null;
    }
}
