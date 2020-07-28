/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hackerrank.Implementations;

/**
 *
 * @author Dhimam
 */
import java.util.*;
class electronicshop
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        int a1[]=new int[a];
        int a2[]=new int[b];
        int max=0,z=0;
        for(int i=0;i<a;i++)
        {a1[i]=s.nextInt();}
        for(int i=0;i<b;i++)
        {a2[i]=s.nextInt();}
        for(int i=0;i<a;i++)
        {
        for(int j=0;j<b;j++)
        {
        if(a1[i]+a2[j]>max && a1[i]+a2[j]<=n)
        {
            z=1;
        max=a1[i]+a2[j];
        }
        }
        }
        if(z==0){System.out.println(-1);}
        else{System.out.println(max);}
        
        
    }
}
