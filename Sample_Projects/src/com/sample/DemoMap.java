package com.sample;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
		Map<Integer, String> m=new HashMap<Integer,String>();
		m.put(1, "surya");
		m.put(4, "surya");
		m.put(3, "surya");
		m.put(2, "surya");
		//m.put(1, "surya1");
		System.out.println(m.values());
		System.out.println(m.keySet());
	}

}
