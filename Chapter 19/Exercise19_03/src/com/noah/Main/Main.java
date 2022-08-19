package com.noah.Main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	ArrayList<String> strArr = new ArrayList<>();
	strArr.add("Tom");
	strArr.add("Kim");
	strArr.add("Susan");
	strArr.add("Tom");
	
	ArrayList<String> foo = removeDuplicates(strArr);
	
	System.out.println(foo);
	}
	
	public static <E extends Comparable<E>> ArrayList<E> removeDuplicates(ArrayList<E> list) {
	
		ArrayList<E> l2 = list; // copy of list to manipulate and return
		
		E min; // First element in l2 array list
		int minIndex; // First index in l2
		
		// sort l2 array list
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
		
		
		// remove duplicates in l2
		for(int i = 0; i < l2.size() - 1; i++) {
			for(int j = i + 1; j < l2.size(); j++) {
				if(l2.get(i).compareTo(l2.get(j)) == 0) {
					l2.remove(j);
				}
				
			}
		}
		return l2;
	}
}