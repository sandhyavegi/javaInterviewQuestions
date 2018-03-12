package javacore;

import java.util.Arrays;

public class secondLargestNumber {

	public static void main(String[] args) {
	int [] a={2,6,4,8,19,18};
	
  Arrays.sort(a);
  System.out.println(a[a.length-2]);
  
	}

}
