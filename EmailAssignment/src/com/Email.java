package com;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		String[] a= {"bangalore@gmail.com",
		
				"delhi@gmail.com",
				"pune@yahoo.com",
				"mangalore@yahoo.com",
				"chennai@hotmail.com",
				"hyderabad@hotmail.com",
				"jaipur@outlook.com",
				"srinagar@outlook.com",
				"kolkata@gmail.com",
				"nagpur@yahoo.com"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Valid Email ID");
		boolean email=false;
		for(int j=0;j<a.length;j++) {
			String b=sc.next();
			for(int i=0;i<a.length;i++) {
				if(b.equals(a[i])){
				email=true;
			}	
		}
		if(email)
		{
			System.out.println("Login Successful");
		}
		else
		{
			System.out.println("Invalid Email!! Please enter a Valid Email ID");
		}

}
		sc.close();
}
}