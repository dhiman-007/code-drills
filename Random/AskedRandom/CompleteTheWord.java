// https://edabit.com/challenge/t9S9nNr79pLqjXgqb

public class Challenge {
	public static boolean canComplete(String initial, String word) {
		boolean found = false;
		int counter = 0, index = 0;
    
		for(int i=0;i<initial.length();i++){
			found = false;
			for(int j = index; j < word.length(); j++){
				if(initial.charAt(i) == word.charAt(j)) {
					counter++;
					index = j+1;
					found = true;
					break;
				}
			}
			if(!found) return false;
		}
    
		if(counter != initial.length()) return false;
		return true;
	}
}
