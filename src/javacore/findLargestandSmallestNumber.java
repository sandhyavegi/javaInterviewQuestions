package javacore;

public class findLargestandSmallestNumber {

	public static void main(String[] args) {
		int [] s={-1,4,6,8,9,123};
		int large=s[0];
		int small=s[0];
		for(int i=1;i<s.length;i++){
			if(s[i]>large){
				large=s[i];
				
			}
		
			else if(s[i]<small){
				small=s[i];
				}
			
		}
		
		System.out.println("the largest number is :" + large);
		System.out.println("the smallest number is:"+ small);
	
		

	}

}
