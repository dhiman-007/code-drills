import java.util.*;
import java.lang.*;
import java.io.*;


// https://edabit.com/challenge/rNYqwDqDFZwjZ6A4g
// @Author - Dhiman
class SentenceSearcherII
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int index = s.nextInt();
		String words[] = str.split(" ");
		int indexed  = index >=0 ? index : words.length - 1;
	
		
		//Get a word ending with . before the indexed Word
		int startInd = 0, endInd = 0;
		boolean flagLeft = false, flagRight = false;
		for(int i = indexed - 1; i >=0; i--){
			if( words[i].charAt(words[i].length() - 1) == '.') {
				startInd = i;
				flagLeft = true;
				break;
			}
		}
		
		if(!flagLeft) startInd = 0;
		
		// Similary for right End
		for(int i = indexed; i <words.length; i++){
			if( words[i].charAt(words[i].length() - 1) == '.') {
				endInd = i;
				flagRight = true;
				break;
			}
		}
		
		if(!flagRight) endInd = words.length - 1;
		
		for(int i= startInd + 1; i <= endInd ; i++){
			System.out.print(words[i] + " ");
		}
		
	}
}
