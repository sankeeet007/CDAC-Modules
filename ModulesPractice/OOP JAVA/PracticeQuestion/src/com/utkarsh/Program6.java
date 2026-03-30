package com.utkarsh;

import java.util.ArrayList;
import java.util.Iterator;

public class Program6 {
	public static void main(String args[]) {
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Red");
		arrList.add("Green");
		arrList.add("Blue");
		arrList.add("Grey");
		arrList.add("Black");
		arrList.add("Brown");
		
		String toSearch="Black";
		boolean found=false;
		
        Iterator<String> iter= arrList.iterator();
    	while(iter.hasNext()) {
    		if(iter.next().equals(toSearch)) {
    			found=true;
    			break;
    			
    		}
	}
    	if (found) {
            System.out.println(toSearch + " was found in the list");
        } else {
            System.out.println(toSearch + " was not found");
        }
	
	
	}
}


