package com.shankar.arrays.sort;

import java.util.Arrays;

public class Util {
	
	public static void printArray(int[] array){
		Arrays.stream(array).forEach(s -> System.out.print(s+"  "));
		System.out.println();
	}
}
