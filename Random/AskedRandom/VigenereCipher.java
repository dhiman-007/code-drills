import java.util.*;
import java.lang.*;
import java.io.*;


// https://edabit.com/challenge/BWm34MorRuaJXiaz6
// @Author - Dhiman
class VigenereCipher
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s = new Scanner(System.in);
		String text = s.nextLine();
		String key = s.nextLine();
		
		char ch[][] = new char[26][26];
		
		for(int i=0 ; i < 26; i++){
			int cnt = 0, temp = i;
			for(int j=0 ; j < 26; j++){
				ch[i][j] = (temp + 65) > 90 ? (char)(65 + cnt++)  : (char)(temp + 65);
				temp++;
			}
		}
		
		String words[] =  text.replace(String.valueOf("."), "").split(" ");
		String plainText = String.join("", words).toUpperCase();
		
		String altKey = "";
		for(int rep = 0; rep < plainText.length() / key.length() ; rep++){
			altKey += key;
		}
		
		for(int j = 0; j < plainText.length() % key.length(); j++){
			altKey += key.charAt(j);
		}
		altKey = altKey.toUpperCase();
		
		String res = "";
		for(int k=0; k < plainText.length(); k++){
			int colInd  = (int)(plainText.charAt(k) - 65);
			int rowInd = (int)(altKey.charAt(k) - 65);
			res += ch[rowInd][colInd];
		}
	  
		System.out.println(res);
		
	}
}
