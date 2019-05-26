package com.class31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		
		/*
		 * Create an arrayList of even numbers from 1 to 50. 
		 * Using Iterator remove any number that is divisible by 5 from that arrayList.
		 */
		
		List<Integer> list=new ArrayList<>();
//		for (int i=1; i<=50; i++) {
//			if(i%2==0) {
//				list.add(i);
//			}
//		}
		for (int i=2; i<=50; i+=2) {
			list.add(i);
		}
		
		Iterator<Integer>it=list.iterator();
		while(it.hasNext()) {
			int num=it.next();
			if(num%5==0) {
				it.remove();
			}
		}
		System.out.println(list);
	}
}
// 4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.