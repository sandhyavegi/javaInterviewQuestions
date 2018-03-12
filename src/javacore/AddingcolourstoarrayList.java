package javacore;


import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class AddingcolourstoarrayList {

	public static void main(String[] args) {
		 
			  List <String> colour=new ArrayList<String>();
			  colour.add("orange");
			  colour.add("grey");
			  colour.add("blue");
			  colour.add("red");
			  colour.add("green");
			  //System.out.println(colour);
			//for(String j:colour){
				//System.out.println(j);

	//Collections.sort(colour);
	System.out.println(colour);	
	List<String> gap=colour.subList(0, 2);
	System.out.println(gap);	
	}
			}

	


