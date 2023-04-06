package com.ZTest.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) {
		String name = new String("Pratik");
		
		Map<Integer,Character> map = new LinkedHashMap<Integer,Character>();
		
		for(int i = 0 ; i <name.length();i++) {
			map.put(i,name.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Integer, Character> entry : map.entrySet()) {
			System.out.println(sb.append(entry.getValue()));
		}
		
//		//HashMap<Integer,Character> map = new HashMap<Integer,Character>();
//		for(int i = 0;i<name.length();i++) {
//			map.put(i, name.charAt(i));
//		}
//		//StringBuilder sb = new StringBuilder();
//		
//		for(int i = name.length()-1;i>= 0;i--) {
//			sb.append(map.get(i));
//		}
		System.out.println(sb.toString());
		
	}
    
}
