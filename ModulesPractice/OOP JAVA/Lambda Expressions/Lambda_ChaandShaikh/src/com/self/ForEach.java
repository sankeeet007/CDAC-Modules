package com.self;

import java.util.Arrays;
import java.util.List;

class DataNew {
	private String name;
	
	public DataNew(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
		
}

public class ForEach {

	public static void main(String[] args) {
		List<DataNew> list = Arrays.asList(new DataNew("Sanket"),new DataNew("Abhishek"),new DataNew("Ram"));
		list.forEach(i -> {
			if(i.getName().toLowerCase().equals("sanket"))
			System.out.print("King: " + i.getName() );	
		});
		
	}
}














