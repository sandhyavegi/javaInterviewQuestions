package javacore;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s ="sandeep";
	StringBuffer bf=new StringBuffer();
		char[] input=s.toCharArray();
		Set  c=new HashSet();	
for(char f:input){
boolean flag=c.add(f);
if (flag){
	bf.append(f);
}
}
System.out.println(bf);
	}

}
