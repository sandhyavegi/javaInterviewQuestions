package javacore;

public class ImplemetingBubblesort {

	public static void main(String[] args) {
		int[] s={2,6,4,8,3};
		int temp;
	for(int i=0;i<s.length;i++){
		for(int j=1;j<(s.length)-i;j++){
			if(s[j-1]>s[j]){
				temp=s[j-1];
				s[j-1]=s[j];
				s[j]=temp;
				
			}
		}
	}
		for(int k:s){
			System.out.println(k);
		
	}

	}

}
