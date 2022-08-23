package com.noah.Main;

public class Main {

	public static void main(String[] args) {
		Integer[] arr = {5, 1, 3, 2, 6, 8, 7};
		
		Integer test = max(arr);
		System.out.println(test);
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		E[] l2 = list;
		
		E min;
		int minIndex;
		
		for(int i = 0; i < l2.length - 1; i++) {
			min = l2[i];
			minIndex = i;
			for(int j = i + 1; j < l2.length; j++) {
				if(min.compareTo(l2[j]) > 0) {
					min = l2[j];
					minIndex = j;
				}
			}
			if(minIndex != i) {
				E temp = l2[i];
				l2[i] = min;
				l2[minIndex] = temp;
			}
		}
		
		return l2[l2.length - 1];
	}

}
