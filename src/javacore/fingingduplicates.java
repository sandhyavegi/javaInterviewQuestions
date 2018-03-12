package javacore;

import java.util.HashSet;
import java.util.Set;

public class fingingduplicates {

	public static void main(String[] args) {
		String [] s={"java","selenium", "perl","php","java"};
		
for(int i=0;i<s.length;i++){
	for(int j=i+1;j<s.length;j++){
		if(s[i].equals(s[j])){
			System.out.println(s[i]);
		}
	}
}
Set<String> set=new HashSet<>();
for(String name:s ){
	if(set.add(name)==false){
		System.out.println(name);
	}
}
	}

}
