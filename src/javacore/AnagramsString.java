package javacore;

import java.util.Arrays;

public class AnagramsString {

	public static void main(String[] args) {
		String str="java";
		String str1="avaj";
	System.out.println(verify(str,str1));	
		
		
	}	
	public static boolean verify(String str,String str1){	
		
	char [] a1=str.toCharArray();
	char []b1=str1.toCharArray();
	Arrays.sort(a1);
Arrays.sort(b1);
	
	
	
	
return Arrays.equals(a1, b1);
}
}