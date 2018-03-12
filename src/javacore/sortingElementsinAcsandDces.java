package javacore;

import java.util.Arrays;
import java.util.Collections;

public class sortingElementsinAcsandDces {

	public static void main(String[] args) {
		System.out.println("before sorting");
		int a[]={2,6,7,8,9,3};
		for(int i:a){
			System.out.println(i);
		}
		Arrays.sort(a);
System.out.println("after sorting");
for(int j:a){
	System.out.println(j);
}
	
//Arrays.sort(a,Collections.reverseOrder());

	}

}
