package com.hackerrank.exersisess;

import java.io.*;
import java.util.*;

public class lexico {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum=A.length()+B.length();
        System.out.println(sum);
        int Num=A.compareToIgnoreCase(B);
        if( Num<=0)
        {
            System.out.println("No");
            
        }
        else
        System.out.println("Yes");
        
        
        String A1=A.substring(0, 1).toUpperCase();
        String A2=A.substring(1);
        
        
        String B1=B.substring(0, 1).toUpperCase();
         String B2=B.substring(1);
        
        String A3=A1+A2;
        String B3=B1+B2;
        System.out.print(A3+" ");
        System.out.print(B3);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



