// https://edabit.com/challenge/FPemghc8ut9xfaMGo

public class Rearrange {
  public static String rearrange(String s) {
		String words[] = String.valueOf(s + " ").split(" ");
		String result[] = new String[words.length];
    
		for(String str : words){
			for(char c: str.toCharArray()){
				if(Character.isDigit(c)){
					result[(int)c - 49] = str.replace(String.valueOf(c) , "");
					break;
				}
			}
		}
    
		String res = "";
		for(String s1: result){
				res += s1 + " ";
		}
    
		return res.trim();
	}
}
