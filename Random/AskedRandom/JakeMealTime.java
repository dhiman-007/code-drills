import java.util.*;
import java.lang.*;
import java.io.*;

class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
    
		Scanner s = new Scanner(System.in);
		String time = s.nextLine().toUpperCase();
		String[] timeArr = time.split(" ");
		
		if(!(timeArr[1].equals("P.M.")) && !(timeArr[1].equals("A.M."))){
			System.out.println("Invalid Time");
			return;
		}
		
		String hourAndMinuteArr[] = timeArr[0].split(":");
		int hour = Integer.parseInt(hourAndMinuteArr[0]);
    int minute = Integer.parseInt(hourAndMinuteArr[1]); 
		String outputTime = "";
		
		if(timeArr[1].equals("A.M.")){
			
			if(hour == 12)
				outputTime = 7 + " hour and " + (minute == 0 ? 0 : 60 - minute) + " minute";
			else if(hour < 7) 
				outputTime = (7 - hour - 1) + " hour and " + (minute == 0 ? 0 : 60 - minute) + " minute"; 
			else if(hour > 7) 
				outputTime = (12 - hour - 1) + " hour and " + (minute == 0 ? 0 : 60 - minute) + " minute";
			
		}
		else{
			
			if(hour == 12)
				outputTime = 7 + " hour and " + (minute == 0 ? 0 : 60 - minute) + " minute";
			
			else if(hour >= 1 && hour < 8)
				outputTime = (8 - hour - 1) + " hour and " + (minute == 0 ? 0 : 60 - minute) + " minute";
			
			else if(hour >= 8 && hour <= 11)
				outputTime = (7 + (12 - hour-1)) + " hour and " + (minute == 0 ? 0 : 60 - minute) + " minute";
			
		}
		System.out.println(outputTime);
	}
}
