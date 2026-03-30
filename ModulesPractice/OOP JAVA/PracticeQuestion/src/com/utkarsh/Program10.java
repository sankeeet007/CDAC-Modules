package com.utkarsh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program10 {
	public static void main(String args[]) {
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Red");
		arrList.add("Green");
		arrList.add("Blue"); 
		arrList.add("Grey");
		arrList.add("Black");
		arrList.add("Brown");
		
		ArrayList<String> copyArrList =new ArrayList<>();
		
		copyArrList.addAll(arrList);
        
		Collections.reverse(copyArrList);
		Iterator<String> iter= copyArrList.iterator();
    	while(iter.hasNext()) {
    		String data=iter.next();
    		System.out.println(data);
	}
	
	
	}
}


