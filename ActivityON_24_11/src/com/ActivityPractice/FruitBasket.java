package com.ActivityPractice;

import java.util.ArrayList;

public class FruitBasket {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("guva");
		al.add("pineapple");
		al.add("apple");
		
		for(String s:al) {
			System.out.println("fruits in Basket are"+" "+ s);
		}
		
		System.out.println(al.remove("guva"));
		for(String s:al) {
			System.out.println("fruits in Basket are"+" "+ s);
		}
		ArrayList<String> all = new ArrayList<String>();
		all.add("banana");
		al.addAll(all);
		for(String s:all) {
			System.out.println("fruits are added to the basket"+" "+ s);
			
		}

	}

}
