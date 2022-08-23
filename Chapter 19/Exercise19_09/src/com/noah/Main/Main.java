package com.noah.Main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> strArr = new ArrayList<>();
		strArr.add("Tom");
		strArr.add("Kim");
		strArr.add("Susan");
		
		ArrayList<String> test = sort(strArr);
		
		System.out.println(test);

	}
	public static <E extends Comparable<E>> ArrayList<E> sort(ArrayList<E> list) {
		
		ArrayList<E> l2 = list;
		
		E min; 
		int minIndex;
		
		for(int i = 0; i < l2.size() - 1; i++) {
			min = l2.get(i);
			minIndex = i;
	
			for(int j = i + 1; j < l2.size(); j++) {
				if(min.compareTo(l2.get(j)) > 0) {
					min = l2.get(j);
					minIndex = j;
				}
			}
			if(minIndex != i) {
				E temp = l2.get(i);
				l2.set(i, min);
				l2.set(minIndex, temp);
			}
		}
		return l2;
	}
}
