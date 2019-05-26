package com.class33;
import java.util.*;
public class Countries {

	public static void main(String[] args) {
	Map<String, String> map = new HashMap();
	map.put("USA", "Washington");
	map.put("Belarus", "Minsk");
	map.put("Australia", "Canberra");
	map.put("China", "Beijing");
	
	Set <String> keys=map.keySet();
	for (String key: keys) {
		System.out.println(key+": "+map.get(key));
	}
	System.out.println("---------------------------------------");
	Iterator<String> keysIt=keys.iterator();
	while(keysIt.hasNext()) {
		String key=keysIt.next();
		System.out.println(key+":"+map.get(key));
	}
	System.out.println("---------------------------------------");
	Collection <String > values=map.values();
	for (String value: values) {
		System.out.print(value+", ");
		System.out.println();
		}
		System.out.println("---------------------------------------");	
		Iterator<String> itValues=values.iterator();
		while(itValues.hasNext()) {
			System.out.print(itValues.next()+", ");
	}
}
}