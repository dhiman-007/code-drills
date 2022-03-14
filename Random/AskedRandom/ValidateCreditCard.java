public class Validate{
  
  public static int getSum(int n){
    int sum = 0;
    while(n > 0){
      int d = n % 10;
      sum += d;
      n /= 10;
    }
    return sum;
  }
  
  public static boolean validate(String n){
    // TODO: solution
    int length = n.length();
    int ind = length % 2 == 0 ? 0 : 1;
    char ch[] = n.toCharArray();
    for(int i=ind;i<ch.length;i++){
      int num = (ch[i] - 48) * 2;
      if(num > 9) {
        num = Validate.getSum(num); 
        ch[i] = Integer.toString(num).charAt(0);
      } 
      else ch[i] = Integer.toString(num).charAt(0);
      i += 1;
    }
    int numberToCheck = Validate.getSum(Integer.parseInt(String.valueOf(ch)));
    if(numberToCheck % 10 == 0) return true;
    else return false;
  }
}
