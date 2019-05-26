package homework;

import java.util.*;
import java.util.Map.Entry;
class Main {
	public static void print(Map<String, Integer> map)  {
	     if(!map.isEmpty()) {
	    	 System.out.println(map);
	     } else {
	    	 System.out.println("map is empty");
	     }
    }
	public static void main(String[] args){
		HashMap<String, Integer> map = new HashMap<String, Integer>();	
		map.put("mango", 10); 
	       map.put("apple", 30); 
	       map.put("orange", 20); 
	       map.put("banana", 30); 
	       map.put("grapes", 20);
		System.out.println(map);
	}
}
/*
Create hashmap with key and values pairs 
add values as below
make sure you insert map.put in the same order as below
       map.put("mango", 10); 
       map.put("apple", 30); 
       map.put("orange", 20); 
       map.put("banana", 30); 
       map.put("grapes", 20);
Output
 
{orange=20, banana=30, apple=30, mango=10, grapes=20}
*/