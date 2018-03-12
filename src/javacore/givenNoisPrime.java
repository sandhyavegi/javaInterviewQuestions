package javacore;

import java.util.Scanner;

public class givenNoisPrime {

	public static void main(String[] args) {
		System.out.println("enter a number:");
	Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	if(s%2==1){
		System.out.println("its a prime number");
	}
	else{
		System.out.println("not a prime number");
	}
	}

}
