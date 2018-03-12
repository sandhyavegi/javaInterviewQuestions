package javacore;

import java.util.Scanner;

public class floydsTriagle {

	public static void main(String arg[]){
		int d,n,t,num=1;
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
			 n=sc.nextInt();
		 
		 
		for( d=1;d<n;d++){
			for(t=1;t<=d;t++){
				System.out.print(num +" ");
				num++;
				
			}
		
		System.out.println( " ");
		}
		}
		
}
