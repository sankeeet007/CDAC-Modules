package com.self;

import java.util.function.IntPredicate;

public class Predicate {
	
	public static void main(String[] args) {
		IntPredicate isLessthan18 = (value) -> (value < 18); 
		
		System.out.println("Your Age is Less than: " + isLessthan18.test(20));
	}
}
