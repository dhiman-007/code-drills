// https://edabit.com/challenge/jH4wEAk4gXZommdfo

import java.util.*;
public class Challenge {
	
	static boolean checkPrime(int num){
		if(num <= 1) return false;
       		for(int i=2;i < num/2;i++){
          	 if((num % i)==0)
			 return false;
       		}
       		return true;
	}
	
	public static String sentencePrimeness(String str) {
		str = str.replaceAll("[^a-zA-Z0-9]", " ").trim();
		String words[] = str.split(" ");
		ArrayList<Integer> charCount = new ArrayList<Integer>();
		int wordSum = 0;
    
		for(String s : words){
			for(char c : s.toLowerCase().toCharArray()){
				if(Character.isLetter(c)) 
					wordSum += (int)(c) - 96;
				else
					wordSum += (int)c - 48;
			}
			charCount.add(wordSum);
			wordSum = 0;
		}
    
		int sentenceWordsSum = charCount.stream().mapToInt(Integer::intValue).sum();
    
		if(Challenge.checkPrime(sentenceWordsSum)){
			return "Prime Sentence";
		}
		else{
			for(int i = 0 ; i < charCount.size(); i++){
				if(Challenge.checkPrime(sentenceWordsSum - charCount.get(i)))
					return "Almost Prime Sentence " + "(" + words[i] + ")";
			}
		}
		return "Composite Sentence";
	}
}
