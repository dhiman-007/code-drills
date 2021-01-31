
import java.util.*;
class Paji1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
		String s1 = String.valueOf(n);
		String y = "";
		for(int i=0;i<s1.length()-1;i++){
			y+= ""+s1.charAt(i+1)+s1.charAt(i);
			i+=1;
		}
		y += s1.length()%2!=0 ? s1.substring(s1.length()-1) : "";
		System.out.println(y);
	}
}