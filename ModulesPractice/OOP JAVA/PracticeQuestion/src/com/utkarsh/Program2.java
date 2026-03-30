package com.utkarsh;

import java.util.ArrayList;
import java.util.Iterator;

public class Program2 {
	public static void main(String args[]) {
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Red");
		arrList.add("Green");
		arrList.add("Blue");
		arrList.add("Grey");
		arrList.add("Black");
		arrList.add("Brown");
		
		Iterator<String> iter= arrList.iterator();
		while(iter.hasNext()) {
			String data=iter.next();
			System.out.println(data);
		}
		
		System.out.println("after inserting the element to 1st place"+"\n----------------------------");
		arrList.addFirst("First element inserted");
		
		Iterator<String> iterr= arrList.iterator();
		while(iterr.hasNext()) {
			String data=iterr.next();
			System.out.println(data);
		}
	}

}
