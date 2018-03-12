package javacore;

public class reversStringcompare {

	public static void main(String[] args) {
		String s="mom";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--){
			rev=rev+s.charAt(i);
			
		
		}
		System.out.println(rev);
if(s.equals(rev)){
	System.out.println("is equal");
}
else
{
	System.out.println("not equal");
}
		}
	}

