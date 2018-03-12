package javacore;

public class factorialnumberFrom1to100 {
	public static void main(String args[]){
		   for(int i=1;i<=100;i++){
			   System.out.println("the factorial number of " + i + "are");
		   
	
	for(int j=1;j<=i;j++){
	if(i%j==0)	{
		System.out.println(j);
	}
	}
	}

}
}