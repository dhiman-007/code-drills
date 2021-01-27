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
class pD
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		s.nextLine();
		for(int k=0;k<n;k++){
		int i=0;	
		String s1 = s.nextLine();
		String split[] = s1.split(" ");
		long max = 0;
		for(i=0;i<split.length;i++){
			try{
			long str = Long.parseLong(split[i]);
			if(!split[i].contains("9")){
				if(str>max){
					max = str;
					}
				}
			}
			catch(Exception e){}
		}
		System.out.println(max);
	}
}
}