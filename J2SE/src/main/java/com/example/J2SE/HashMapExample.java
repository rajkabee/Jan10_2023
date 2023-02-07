package com.example.J2SE;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		int[] arr = {43,56,72,19,38};
		for(int i:arr) {
			System.out.print(i+"\t");
		}
		
		System.out.println();
		
		HashMap<Integer, String> names = new HashMap<>();
		names.put(12, "Ramesh");
		names.put(13, "Roshan");
		names.put(42, "Sanjeev");
		names.put(37, "Deepak");
		System.out.println(names);
		HashMap<String, Integer> age = new HashMap<>();
		age.put("Ram", 34);
		age.put("Shyam", 23);
		age.put("Sita", 27);
		age.put("Geeta", 16);
		System.out.println(age);
		
		
		for(Map.Entry<String, Integer> a:age.entrySet()) {
			System.out.println(a.getKey()+" : "+a.getValue());
		}
		age.forEach((k,v)->{
			System.out.println(k+"  =  "+v);
		});
		
		
		
		
		
		
		
	}
}
