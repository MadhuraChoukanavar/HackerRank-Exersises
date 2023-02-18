package com.hackerrank.exersisess;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the string");
		String s=scn.next();
		String exp="[!@#$%^&*?.,\\s]";
		Pattern p=Pattern.compile(exp);
		Matcher m=p.matcher(s);
//		while(m.find()) {
//			System.out.println(m.group());  
//		m.find();
//		}
			String[] s1=s.split(exp);
			for(String s2:s1) {
				System.out.println(s2);

		}
		
	}

}
