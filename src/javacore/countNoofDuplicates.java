package javacore;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countNoofDuplicates {

	public static void main(String[] args) {
	String s="sandeep";
	displayduplicatecount(s);
	
	}
	public static void displayduplicatecount(String s){
		
	
	
	Map<Character,Integer> map=new HashMap<>();
	char[] chars=s.toCharArray();
	for(char h:chars){
		if(!map.containsKey(h)){
		 map.put(h, 1);
		}
		else{
			map.put(h, map.get(h)+1);
		}
	
	Set<Map.Entry<Character,Integer>> entrySet=map.entrySet();
	for(Map.Entry<Character, Integer> entry:entrySet){
		if(entry.getValue()>1){
			System.out.printf("%s :%d %n",entry.getKey(),entry.getValue());
		}
		
	}
	
	}
	
	
	

	}

}
