package javacore;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;



public class sortHashmap {

	public static void main(String[] args) {
		Map<Integer,Integer> map1=new HashMap<>();
		map1.put(1, 20);
		map1.put(5, 60);
		map1.put(3, 40);
		map1.put(4, 30);
		map1.put(2, 50);
		for(Map.Entry<Integer, Integer> m: map1.entrySet()){
		System.out.println(m.getKey()+" "+m.getValue());
		}
	
Map<Integer,Integer> tree=new TreeMap<>(map1);
for(Map.Entry<Integer, Integer> k:tree.entrySet()){
	System.out.println(k.getKey());
}
	}
}
