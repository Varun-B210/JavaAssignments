package com.calci;

import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		float a;
		float b;
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		sc.close();
		System.out.println("Addition : "+(a)+ " + " + (b)+ " = " + (a+b));
		System.out.println("Subtraction : "+(a) + " - " + (b)+ " = " + (a-b));
		System.out.println("Multiplication : "+(a) + " * " + (b)+ " = " + (a*b));
		if(b==0) {
			System.out.println("Division : "+(a) + " / " + (b)+ " = Not Defined");
		}
		else 
		{
			System.out.println("Division : "+(a) + " / " + (b)+ " = " + (a/b));
		}
	}
}
