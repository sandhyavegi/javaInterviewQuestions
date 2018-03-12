package javacore;

public class ReverseofNumber {

	public static void main(String[] args) {
		int num=78465;
		int rev=0;
		for( int i=0;i<5;i++){
			rev=rev*10+num%10;
			num=num/10;
		}

	System.out.println(rev);
	}

}
