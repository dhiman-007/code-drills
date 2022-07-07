import java.util.*;
public class RisenOrFallen {
	
	static boolean checkIncrease(int num){
		while(num > 0){
			int c  = num % 10;
			num /= 10;
			if(num % 10 > c) return false;
		}
		return true;
	}
	
	static boolean checkDecrease(int num){
		while(num >= 10){
			int c  = num % 10;
			num /= 10;
			if(num % 10 < c) return false;
		}
		return true;
	}
	
  public static int incDec(int n) {
    
		int l = 1;
		int r = (int)Math.pow(10 , n);
		
// 		System.out.println(l + "    " + r);
		
		int counter = 0;
		for(int i=l;i<=r;i++){
				if(checkIncrease(i))
					counter++;
				else
				if(checkDecrease(i))
					counter++;
			}
    
		return counter;
		}
  }
