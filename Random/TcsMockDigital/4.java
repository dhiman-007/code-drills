/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codeforces;

/**
 *
 * @author Dhimam
 */

import java.util.*;
class ayuhshWipro
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input Array
		char ch1[] = { 'a' , 'b' , 'c' , 'd', 'a'};
		char ch2[] = { 'a' , 'e' , 'g' , 'l' , 'b' , 'f'};
		
		//Converting them into String
		String s1 = String.valueOf(ch1);
		String s2 = String.valueOf(ch2);
		
		int sum = 0, i = 0;
		int a1 [] = new int[26];
		int a2 [] = new int[26];
	    
		
		for(i = 0 ; i < s1.length() ; i++) {
			a1[s1.charAt(i) - 97]++;
		}
	      
		for(i = 0 ; i < s2.length() ; i++) {
			a2[s2.charAt(i) - 97]++;
		}
	    

		for(i = 0 ; i < 26 ; i++){
			// check for uncommon characters
			if(a1[i] > 0 && a2[i] == 0 || a1[i] == 0 && a2[i] > 0){
				//summing their Ascii value
				sum += (i + 97);
			}
		}
		
		// To get Single digit sum
		int sum1 = 0;
		while(sum > 9) {
		   int n = sum ;
		   while( n > 0){
			   int d = n % 10;
			   sum1 += d;
			   n /= 10;
		   }
		   sum  = sum1;	
		   sum1 = 0;
		 }
		System.out.println(sum);
		
	}
}