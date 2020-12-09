package com.test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 1st number");
		int x=sc.nextInt();
		System.out.println("enter 2nd number");
		int y=sc.nextInt();
		
		System.out.println(Test3.add(x, y));
		
	}

	public static int add(int a, int b) {
		
		int c= a+b;
		return c;

		
	}

}
