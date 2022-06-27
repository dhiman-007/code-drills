
// https://edabit.com/challenge/JLQ4upWrq5LkzdhPE

public class Challenge {
  public static int NumberOfDays(int cost, int savings, int start) {
		int count = 0;
		boolean flag = false;
		int acc = start + savings;
		while(true){
			int temp = start, weekAmount = 0;
			for(int i=1;i<=7;i++){
				if(acc <= cost){
					//System.out.println("In Loop Sum   " + (acc));
					weekAmount += start;
					count++;
					start += 1;
					acc += start;
				}
				else{
					//count++;
					flag = true;
					break;
				}
			//	System.out.println(start + " : in Loop");
			}
			if(flag) break;
			start = temp + 1;
			savings = savings + weekAmount;
			acc = savings;
			//System.out.println(start + "     " + savings);
		}
		///System.out.println(count);
		return count ;
  }
}

