package com.sample;

import java.util.Comparator;
import java.util.TreeSet;
class Mycomparetor implements Comparator{

	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		String i1=(String)obj1;
		String i2=(String)obj2;
		return -i1.compareTo(i2);
	}
	
}

public class ComprableDnso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet<String>(new Mycomparetor());
		t.add("surya narayana");
		t.add("venkatesh");
		t.add("ajay");
		t.add("ravi");
		System.out.println(t);

	}

}
