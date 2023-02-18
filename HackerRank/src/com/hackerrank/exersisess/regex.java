package com.hackerrank.exersisess;

import java.util.Scanner;

public class regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] splittedArray=s.trim().split("[ !,?._'@]+");
       if(s.trim().equals(""))
       {
           System.out.println(0);
       }
       else { 
            System.out.println(splittedArray.length);
       for (int i=0;i<splittedArray.length;i++)
       {
           System.out.println(splittedArray[i]);
       }
       }

	}

}
