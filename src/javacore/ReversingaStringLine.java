package javacore;

public class ReversingaStringLine {

	public static void main(String[] args) {
		String str="my name is naveen";
		String rev[]=str.split(" ");
		String str1="";
		for(int i=rev.length-1;i>=0;i--){
			str1=str1+rev[i]+" ";
		}
System.out.println(str1);
	}

}
