// https://edabit.com/challenge/8NZaLdJBkhZCgNBc7

import java.util.*;
public class Challenge {
	
	static Integer getKeyPressed(char c){
		
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("ABC", 2);
		h.put("DEF", 3);
		h.put("GHI", 4);
		h.put("JKL", 5);
		h.put("MNO", 6);
		h.put("PQRS", 7);
		h.put("TUV", 8);
		h.put("WXYZ", 9);
		
		Optional<Integer> number = h.entrySet()
			.stream()
  		.filter(e -> e.getKey().contains(String.valueOf(c)))
  		.map(Map.Entry::getValue)
  		.findFirst();
		
		return number.isPresent() ? number.get() : Integer.valueOf(0);
	}
	
	public static String textToNum(String phone) {
		String result = "";
		for(char c: phone.toCharArray()){
			if(Character.isLetter(c)){
				result += String.valueOf(Challenge.getKeyPressed(c));
			}
			else result += String.valueOf(c);
		}
		return result;
	}
}
