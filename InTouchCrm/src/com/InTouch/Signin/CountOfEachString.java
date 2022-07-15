package com.InTouch.Signin;

public class CountOfEachString {

	public static void main(String[] args) {
		String s="hello iam a java programmer";
		int count=0;
		String[] a=s.split(" ");
		for(String s1:a) {
			count++;
			System.out.println(s1+" "+s1.length());
			//for(int i=0;i<s1.length();i++)
		}
		
	}

}

