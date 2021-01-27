/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

/**
 *
 * @author Dhimam
 */
import java.util.*;
public class pD
{
	static boolean prime(int x){
		int z = 0;
		for(int i=2;i<=x/2;i++){
			if(x%i==0){
				z=1;
				break;
			}
		}
		if(z==0) return true;
		else return false;
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int m= s.nextInt();
		int n=s.nextInt();
		int count = 0, hold=0 , check=0;
		for(int i=m;i<n;i++){
			if(pD.prime(i)){
				for(int j=i+1;j<=n;j++){
					if(pD.prime(j) && j-i==6) {
						check++;
						if(check == 1) {hold = j;}
						count++;
					}
				}
				m = hold;
			    check = 0;
			}
			
		}
		System.out.println(count);
	}
}
