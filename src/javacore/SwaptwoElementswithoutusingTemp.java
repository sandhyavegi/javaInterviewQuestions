package javacore;

public class SwaptwoElementswithoutusingTemp {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("Before Swapping" +x);
		System.out.println("Before Swapping"+ y);
		 x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping" +x);
		System.out.println("After Swapping"+ y);

	}

}
