package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareTwoMaps {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{5, 6,  10}));

	    int head = list.get(0);
	    int tail = list.get(list.size() - 1);

	    int length = tail - head + 1;
	    int[] array = new int[length];

	    for (int i : list) {
	        array[i - head] = 1;
	    }

	    for (int i = 0; i < array.length; i++) {
	        if (array[i] == 0) {
	            System.out.println(String.format("Missing %d, position %d", i + head, i + 1));
	        }
	    }
/*	    String s1=new String("surya");
	    String s12=new String("surya");
	    System.out.println(s1.equals(s12));
	    System.out.println(s1==s12);
	    
	    ArrayList a=new ArrayList<>();
	    a.add(11);
	    a.add(12);
	    a.add(13);
	    System.out.println(a);
*/	    

	}
}
