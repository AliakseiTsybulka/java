package com.class33;
import java.util.*;
import java.util.Map.Entry;
public class Store {

	public static void main(String[] args) {
		Map<Integer, String> bestBuy = new LinkedHashMap<>();
		bestBuy.put(7664847, "Printer");
		bestBuy.put(7879885, "TV");
		bestBuy.put(7884591, "Computer");
		
		for ( Map.Entry<Integer, String> obj : bestBuy.entrySet() ) {
			System.out.println(obj.getKey()+": "+obj.getValue());
		}
		System.out.println("-------------------------------------------------");
		
		Iterator<Map.Entry<Integer, String>> it = bestBuy.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<Integer, String> obj = it.next();
			System.out.println(obj.getKey()+": "+obj.getValue());
		}
	}

}
/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Print all keys and values from a Best Buy map using EntrySet.
*/