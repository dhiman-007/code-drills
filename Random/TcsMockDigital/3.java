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
//Tcs Question
 class WorkAtTech
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int flag = 0, count = 0;
		ArrayList<Integer> x = new ArrayList<Integer>();
		for(int i = n1; i<=n2; i++){
		    int j = i;
			while( j > 0){
			    int d = j %10;
				if(x.contains(d)) { 
				    flag = 1; 
				    break; 
				}
				x.add(d);
				j /= 10;
			}
		    if(flag == 0) {count++;}
			x.clear();
			flag = 0;
		}
		System.out.println(count);
	}
}