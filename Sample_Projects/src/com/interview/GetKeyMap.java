package com.interview;

import java.util.HashMap;
import java.util.Map;

public class GetKeyMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String > map=new HashMap<>();
		
		map.put(101, "java");
		map.put(102, ".Net");
		map.put(103, "ServiceNow");
		map.put(104, "Python");
		System.out.println(map.keySet());
		System.out.println(map.values());
		/*System.out.println(map);
		 for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  } */
	}

}
