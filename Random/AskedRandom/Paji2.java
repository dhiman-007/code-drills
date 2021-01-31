import java.util.*;
class Paji2{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
		int a[]= new int[n];
		for(int i=0;i<n;i++){
			a[i] = s.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
			sum += a[i];
		}
		int r = (int)Math.round(Math.cbrt(sum));
		if(r*r*r == sum){
			System.out.println("YES");
		}else{
			int x = sum+1, original = sum, store =0;
			while(true){
				r = (int)Math.round(Math.cbrt(x));
				if(r*r*r == x) {store = x; break;}
				x++;
			}
			System.out.println(store - original);
		}
	}
}