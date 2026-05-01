package com.self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data{
	String nameString;
	public Data(String name) {
		this.nameString = name;
	}
	public String getName() {
		return nameString;
	}
	@Override
	public String toString() {
		return "Data => Name :" + nameString;
	}
	
}

public class Lambda01 {

	public static void main(String[] args) {
	List<Data> li = new ArrayList<>();
	li.add(new Data("Sanket"));
	li.add(new Data("Abhishek"));
	li.add(new Data("Vivek"));
	li.add(new Data("Tejas"));
	li.add(new Data("Ram"));
	
	// Sorting using Collection and Lambda Expression
	/* Collections.sort(li, (o1, o2) -> o1.getName().compareTo(o2.getName())); */ 
	
	// Sorting Based on Length of the Names
	/* Collections.sort(li, (o1, o2) -> { 
		 
		 	if(o1.getName().length() < o2.getName().length()) {
		 		return -1;
		 	} else if(o1.getName().length() > o2.getName().length()) {
		 		return 1;
		 	} else {
		 		return 0;
		 	}
		 });
	*/
		for(Data tmpData : li) {
			System.out.println(tmpData);
		}
   }
}

















