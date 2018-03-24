package com.sample;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
	    list.add("Krishna");
	    list.add("Krishna");
	    list.add("Krishna");
	    list.add("Aryan");
	    list.add("Harm");

	System.out.println("List"+list);
	HashSet hs = new HashSet();
	hs.addAll(list);
	list.clear();
	list.addAll(hs);
	System.out.println("List After"+ list);
	}

}
