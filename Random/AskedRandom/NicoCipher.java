import java.util.*;
import java.lang.*;
import java.io.*;

// @Author - Dhiman
class NicoCipher
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner s = new Scanner(System.in);
			String message = s.nextLine(), key = s.nextLine(), tempKey = key;
		
			int rows = message.length() % key.length() == 0 
				? message.length() / key.length() 
				: message.length() / key.length() + 1;
			
			int cols = key.length();
		
			char ch[][] = new char[rows][cols];
			int ind = 0, cnt = 1;
		
			for(int i=0 ; i < rows; i++){
				for(int j = 0; j < cols; j++) {
					ch[i][j] = ind >= message.length() ? '\0' : message.charAt(ind++);
				}
			}
		
			char[] chars = key.toCharArray();
      			Arrays.sort(chars);
      			String sorted = new String(chars);	
		
			HashMap<Character, Integer> h = new HashMap<>();
			for(char c: sorted.toCharArray()){
				h.put(c, cnt++);
			}
			
			// Filling ranking of Chacarter on respective index of String
			int ranking[] = new int[key.length()];
			for(int i=0; i< tempKey.length(); i++){
				ranking[i] = h.get(tempKey.charAt(i));
			}
		
      			// Encrption or Movement as Per Algo
		  	char res[][] = new char[rows][cols];
			for(int i=0 ; i < ranking.length; i++){
				int colNo = ranking[i];
				for(int k = 0; k < rows; k++){
					res[k][colNo - 1] = ch[k][i];
				}
			}
		
			String yeRahiEncryptedString = "";
			for(int i=0 ; i < rows; i++){
				for(int k = 0; k < cols; k++){
					yeRahiEncryptedString += String.valueOf(res[i][k]);
				}
			}
		
			System.out.println(yeRahiEncryptedString);
			
	}
}
